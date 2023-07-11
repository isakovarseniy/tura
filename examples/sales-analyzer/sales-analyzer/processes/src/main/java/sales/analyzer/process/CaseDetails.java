/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sales.analyzer.process;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

import org.drools.persistence.jpa.marshaller.VariableEntity;
import org.kie.api.remote.Remotable;

@Entity
@XmlRootElement
@Remotable
public class CaseDetails extends VariableEntity {

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CASEDETAILS_ID_GENERATOR")
	@Id
	@SequenceGenerator(name = "CASEDETAILS_ID_GENERATOR", sequenceName = "KIESERVER.CASEDETAILS_ID_SEQ")
	private Long id;

	@Embedded
	private BusinessInfo info;

	@Version
	@Column(name = "OPTLOCK")
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BusinessInfo getInfo() {
		return info;
	}

	public void setInfo(BusinessInfo info) {
		this.info = info;
	}

}
