/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.hrcontroller.actions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.IBeanFactory;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.UserArtifitialFieldsAdapter;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.repository.core.ObjectControl;

/**
 * <p>
 * This class manages the login page for JSF.<br />
 * It allows logging in and out, as wel as retrieving the current user (if any)
 * and more.
 * </p>
 * 
 * <p>
 * It also works as a substitute for the
 * <code>j_security_check/j_username/j_password</code> form (which is buggy!).
 * Having this bean, our login form can be pure JSF, allowing a more
 * fine-grained control and all (such as embedding validation/error messages in
 * the form itself; custom {@link User} instances building and so on).
 * </p>
 */
public class LoginManager implements EventAccessor {

	@SuppressWarnings("unused")
	private ActionEvent event;

	private transient Logger logger = Logger.getLogger(LoginManager.class.getName());

	@Inject
	ELResolver elResolver;

	private static final String SESSION_USER_VARIABLE_NAME = "user";
	private static final String PAGE_AFTER_LOGOUT = "/"; // Another good
															// option is the
															// login page
															// back again
	private static final String HOME_PAGE = "/";

	private String forwardUrl;

	@PostConstruct
	public void init() {
		this.forwardUrl = extractRequestedUrlBeforeLogin();
	}

	private String extractRequestedUrlBeforeLogin() {
		ExternalContext externalContext = externalContext();
		String requestedUrl = (String) externalContext.getRequestHeaderMap().get("referer");
		if (requestedUrl == null) {
			return externalContext.getRequestContextPath() + HOME_PAGE;
		}

		return requestedUrl;
	}

	private ExternalContext externalContext() {
		return facesContext().getExternalContext();
	}

	private FacesContext facesContext() {
		return FacesContext.getCurrentInstance();
	}

	/**
	 * Performs user login accordingly to the username/password set.
	 * 
	 * @throws IOException
	 *             from {@link ExternalContext#redirect(String)}
	 */
	public void login() throws IOException {
		String username = null;
		String password = null;
		IBeanFactory bf = null;

		try {
			bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerHRController}");

			new UserArtifitialFieldsAdapter((ObjectControl) (bf.getUser().getCurrentObject())).setLoginError(false);

			IDataControl dc = bf.getUser();
			username = ((org.tura.platform.hr.objects.serialization.User) dc.getCurrentObject()).getUserName();
			password = ((org.tura.platform.hr.objects.serialization.User) dc.getCurrentObject()).getPassword();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

		ExternalContext externalContext = externalContext();
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();

		try {
			request.login(username, password);
			externalContext.getSessionMap().put(SESSION_USER_VARIABLE_NAME, new User(username));
			externalContext.redirect(forwardUrl);
		} catch (ServletException e) {
			/*
			 * The ServletException is thrown if the configured login mechanism
			 * does not support username password authentication, or if a
			 * non-null caller identity had already been established (prior to
			 * the call to login), or if validation of the provided username and
			 * password fails.
			 */
			try {
				new UserArtifitialFieldsAdapter((ObjectControl) bf.getUser().getCurrentObject()).setLoginError(true);
			} catch (Exception e1) {
				logger.log(Level.INFO, e1.getMessage(), e1);
			}
		}
	}

	/**
	 * Invalidates the current session, effectively logging out the current
	 * user.
	 * 
	 * @throws IOException
	 *             from {@link ExternalContext#redirect(String)}
	 */
	public void logout() throws IOException {
		ExternalContext externalContext = externalContext();
		externalContext.invalidateSession();
		externalContext.redirect(externalContext.getRequestContextPath() + PAGE_AFTER_LOGOUT);
	}

	/**
	 * Makes the current logged in available through EL: #{loginManager.user}.
	 * Notice as the user is also placed in the session map (), it also is
	 * available through #{user}.
	 * 
	 * @return The currently logged in {@link User}, or {@code null} if no user
	 *         is logged in.
	 */
	public User getUser() {
		FacesContext context = facesContext();
		ExternalContext externalContext = context.getExternalContext();
		return (User) externalContext.getSessionMap().get("user");
	}

	public boolean isLoginError() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerHRController}");

		try {

			Boolean b = new UserArtifitialFieldsAdapter((ObjectControl) (bf.getUser().getCurrentObject()))
					.getLoginError();
			if (b == null)
				return false;
			return b;
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
			return false;
		}
	}

	/**
	 * Verifies if there is a currently logged in user.
	 * 
	 * @return {@code true} if there's a logged in {@link User}, {@code false}
	 *         otherwise.
	 */
	public boolean isUserLoggedIn() {
		return getUser() != null;
	}

	/**
	 * Verifies if the currently logged in user, if exists, is in the given
	 * ROLE.
	 * 
	 * @param role
	 *            The ROLE to verify if the user has.
	 * @return {@code true} if the user is logged in and has the given ROLE.
	 *         {@code false} otherwise.
	 */
	public boolean isUserInRole(String role) {
		FacesContext context = facesContext();
		ExternalContext externalContext = context.getExternalContext();
		return externalContext.isUserInRole(role.replaceAll("'", ""));
	}

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}