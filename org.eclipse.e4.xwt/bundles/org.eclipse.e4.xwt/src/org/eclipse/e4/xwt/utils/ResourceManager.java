/*******************************************************************************
 * Copyright (c) 2006, 2010 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.xwt.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.e4.xwt.XWTMaps;
import org.eclipse.e4.xwt.elsoft.types.AscDescProperty;
import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.DestinationDataControlProperty;
import org.eclipse.e4.xwt.elsoft.types.ExpressionProperty;
import org.eclipse.e4.xwt.elsoft.types.FieldsProperty;
import org.eclipse.e4.xwt.elsoft.types.FormNameProperty;
import org.eclipse.e4.xwt.elsoft.types.GrantedRoleProperty;
import org.eclipse.e4.xwt.elsoft.types.IDProperty;
import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.LinkFieldProperty;
import org.eclipse.e4.xwt.elsoft.types.MethodProperty;
import org.eclipse.e4.xwt.elsoft.types.OperetionTypeProperty;
import org.eclipse.e4.xwt.elsoft.types.OptionFieldProperty;
import org.eclipse.e4.xwt.elsoft.types.OptionIteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.PrimitiveType;
import org.eclipse.e4.xwt.elsoft.types.RolesProperty;
import org.eclipse.e4.xwt.elsoft.types.ServiceProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerType;
import org.eclipse.e4.xwt.elsoft.types.VisualDependencyProperty;
import org.eclipse.e4.xwt.internal.utils.ObjectUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * @author jliu
 */
public class ResourceManager {

	public static ResourceManager resources = new ResourceManager();

	private Map<String, Color> key2Colors = new HashMap<String, Color>();
	private Map<String, Font> key2Fonts = new HashMap<String, Font>();
	private Map<String, Image> key2Images = new HashMap<String, Image>();

	/**
	 * Default constructor.
	 */
	private ResourceManager() {
	}

	public Color getColor(String colorStr) {
		Color color = key2Colors.get(colorStr);
		if (color == null || color.isDisposed()) {
			key2Colors.put(colorStr, color = ColorTool.getColor(colorStr));
		}
		return color;
	}

	public Font getFont(String fontStr) {
		Font font = key2Fonts.get(fontStr);
		if (font == null || font.isDisposed()) {
			key2Fonts.put(fontStr, font = FontTool.getFont(fontStr));
		}
		return font;
	}

	public Image getImage(String imagePath) {
		if (imagePath == null) {
			return null;
		}
		try {
			return getImage(new URL(imagePath));
		} catch (Exception e) {
			return null;
		}
	}

	public Image getImage(URL file) {
		String key = file.toString();
		Image image = key2Images.get(key);
		if (image == null || image.isDisposed()) {
			key2Images.put(key, image = ImageTool.getImage(file));
		}
		return image;
	}

	public TriggerProperty getTriggerProperty(String field) {
		return new TriggerProperty(field);

	}

	public LinkFieldProperty getStringToLinkFieldProperty(String field) {
		return new LinkFieldProperty(field);

	}

	public TriggerType getTriggerType(String field) {
		return new TriggerType(field);

	}

	public FieldsProperty getFieldsProperty(String field) {
		return new FieldsProperty(field);
	}

	public DestinationDataControlProperty getDestinationDataControlProperty(
			String bo) {
		return new DestinationDataControlProperty(bo);
	}

	public FormNameProperty getStringToFormNameProperty(String frm) {
		return new FormNameProperty(frm);
	}

	public IteratorProperty getIterator(String str) {
		return new IteratorProperty(str);
	}

	public OptionIteratorProperty getOptionIterator(String str) {
		return new OptionIteratorProperty(str);
	}

	public BusinessObjectProperty getBusinessObject(String bo) {

		return new BusinessObjectProperty(bo);

	}

	public SourceProperty getSourceProperty(String prop) {
		return new SourceProperty(prop);
	}

	public MethodProperty getMethodProperty(String prop) {
		return new MethodProperty(prop);
	}

	public ServiceProperty getServiceProperty(String field) {
		return new ServiceProperty(field);
	}

	public PrimitiveType getPrimitiveType(String field) {
		return new PrimitiveType(field);
	}

	public ExpressionProperty getExpressionProperty(String expression) {
		return new ExpressionProperty(expression);
	}

	public OptionFieldProperty getOptionFieldProperty(String field) {
		return new OptionFieldProperty(field);
	}

	public AscDescProperty getAscDescProperty(String order) {
		return new AscDescProperty(order);
	}

	public IDProperty getStringToIDProperty(String prop) {
		return new IDProperty(prop);

	}

	public GrantedRoleProperty getGrantedRoleProperty(String str) {
		return new GrantedRoleProperty(str);
	}

	public RolesProperty getStringToRoleProperty(String prop) {
		return new RolesProperty(prop);
	}

	public OperetionTypeProperty getOperetionTypeProperty(String str) {
		return new OperetionTypeProperty(str);
	}

	public VisualDependencyProperty getVisualDependencyProperty(String prop) {
		return new VisualDependencyProperty(prop);
	}

	public synchronized void dispose() {
		// dispose colors.
		Collection<Color> colors = key2Colors.values();
		for (Color color : colors) {
			if (color != null) {
				color.dispose();
			}
		}
		key2Colors.clear();

		// dispose fonts.
		Collection<Font> fonts = key2Fonts.values();
		for (Font font : fonts) {
			if (font != null) {
				font.dispose();
			}
		}
		key2Colors.clear();

		// dispose images
		Collection<Image> images = key2Images.values();
		for (Image image : images) {
			if (image != null) {
				image.dispose();
			}
		}
	}

	static class ColorTool {
		static Color getColor(String colorStr) {
			if (NamedColorsUtil.hasColor(colorStr)) {
				return NamedColorsUtil.getColor(colorStr);
			}
			if (colorStr.toLowerCase().startsWith("swt.")) {
				return getSWTColor(colorStr);
			} else if (colorStr.startsWith("#")) {
				try {
					int rgb = Integer.parseInt(colorStr.substring(1), 16);
					return getColor(rgb);
				} catch (NumberFormatException e) {
					return null;
				}
			} else if (colorStr.indexOf(",") != -1) {
				List<String> rgbs = new ArrayList<String>();
				StringTokenizer stk = new StringTokenizer(colorStr, ",");
				while (stk.hasMoreTokens()) {
					rgbs.add(stk.nextToken());
				}
				if (rgbs.size() == 3) {
					try {
						int r = Integer.parseInt(rgbs.get(0).trim());
						int g = Integer.parseInt(rgbs.get(1).trim());
						int b = Integer.parseInt(rgbs.get(2).trim());
						return getColor(r, g, b);
					} catch (NumberFormatException e) {
						return null;
					}
				}
			}
			return getSWTColor(colorStr);
		}

		static Color getColor(int red, int green, int blue) {
			if (red > 255 || green > 255 || blue > 255 || red < 0 || green < 0
					|| blue < 0) {
				return null;
			}
			return new Color(Display.getCurrent(), red, green, blue);
		}

		static Color getColor(int rgb) {
			int value = 0xff000000 | rgb;
			int red = (value >> 16) & 0xFF;
			int green = (value >> 8) & 0xFF;
			int blue = (value >> 0) & 0xFF;
			return getColor(red, green, blue);
		}

		static Color getSWTColor(String colorStr) {
			if (!(colorStr.toLowerCase().startsWith("swt."))) {
				if (!(colorStr.toLowerCase().startsWith("color_"))) {
					colorStr = "COLOR_" + colorStr;
				}
				colorStr = "SWT." + colorStr;
			}
			int swtColor = XWTMaps.getColor(colorStr);
			return getSWTColor(swtColor);
		}

		static Color getSWTColor(int swtValue) {
			return Display.getCurrent().getSystemColor(swtValue);
		}
	}

	static class FontTool {

		static Font getFont(String fontStr) {
			if (fontStr.indexOf(",") != -1) {
				StringTokenizer stk = new StringTokenizer(fontStr, ",");
				String name = null;
				int height = 0;
				int style = SWT.NORMAL;
				while (stk.hasMoreTokens()) {
					String token = stk.nextToken().trim();
					if (token.equalsIgnoreCase("normal")
							|| token.equalsIgnoreCase("bold")
							|| token.equalsIgnoreCase("italic")
							|| token.contains("|")) {
						style = (Integer) ObjectUtil.resolveValue(token,
								Integer.class, style);
					} else if (isInt(token)) {
						height = Integer.parseInt(token);
					} else {
						name = token;
					}
				}
				return getFont(name, height, style);
			}
			return getFont(fontStr, 12, SWT.NORMAL);
		}

		static boolean isInt(String value) {
			try {
				Integer.parseInt(value);
			} catch (NumberFormatException e) {
				return false;
			}
			return true;
		}

		static Font getFont(String name, int height, int style) {
			if (name == null) {
				return null;
			}
			return new Font(Display.getCurrent(), name, height, style);
		}

		static Font getSWTFont() {
			return Display.getCurrent().getSystemFont();
		}
	}

	static class ImageTool {

		static Image getImage(String resource) {
			return getImage(ResourceManager.class.getResource(resource));
		}

		static Image getImage(URL url) {
			if (url == null) {
				return null;
			}
			try {
				InputStream stream = url.openStream();
				try {
					return new Image(Display.getCurrent(), stream);
				} finally {
					stream.close();
				}
			} catch (IOException e) {
				return null;
			}
		}
	}
}
