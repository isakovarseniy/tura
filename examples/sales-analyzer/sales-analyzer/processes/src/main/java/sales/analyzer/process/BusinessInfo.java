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

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.persistence.Embeddable;

@Embeddable
public class BusinessInfo {

	private Integer state;
	private Integer city;
	private String product;
	private String caseId;
	private String analystActor;
	private String managerActor;


	public String getAnalystActor() {
		return analystActor;
	}

	public void setAnalystActor(String analystActor) {
		this.analystActor = analystActor;
	}

	public String getManagerActor() {
		return managerActor;
	}

	public void setManagerActor(String managerActor) {
		this.managerActor = managerActor;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		if (state != null) {
			out.writeInt(state);
		} else {
			out.writeUTF("");
		}

		if (city != null) {
			out.writeInt(city);
		} else {
			out.writeUTF("");
		}

		if (product != null) {
			out.writeUTF(product);
		} else {
			out.writeUTF("");
		}		

		if (caseId != null) {
			out.writeUTF(caseId);
		} else {
			out.writeUTF("");
		}
		
		if (analystActor != null) {
			out.writeUTF(analystActor);
		} else {
			out.writeUTF("");
		}		

		if (analystActor != null) {
			out.writeUTF(analystActor);
		} else {
			out.writeUTF("");
		}		

		
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		state = in.readInt();
		city = in.readInt();
		product = in.readUTF();
		caseId = in.readUTF();
		analystActor = in.readUTF();
		managerActor = in.readUTF();
		
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + ((caseId == null) ? 0 : caseId.hashCode());
        result = prime * result + ((analystActor == null) ? 0 : analystActor.hashCode());
        result = prime * result + ((managerActor == null) ? 0 : managerActor.hashCode());
        return result;
    }
	
    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) return true;
        if ( obj == null ) return false;
        if ( !(obj instanceof BusinessInfo) ) return false;
        BusinessInfo other = (BusinessInfo) obj;
        if ( this.state != other.state ) {
            return false;
        }
        if ( this.city != other.city ) {
            return false;
        }
        if ( this.product != other.product ) {
            return false;
        }
        if ( this.caseId != other.caseId ) {
            return false;
        }
        if ( this.analystActor != other.analystActor ) {
            return false;
        }
        if ( this.managerActor != other.managerActor ) {
            return false;
        }
	  return true;
    }
	
}
