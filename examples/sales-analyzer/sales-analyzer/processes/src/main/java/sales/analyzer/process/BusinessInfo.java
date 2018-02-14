package sales.analyzer.process;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.persistence.Embeddable;

@Embeddable
public class BusinessInfo {

	private String state;
	private String city;
	private String product;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
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
			out.writeUTF(state);
		} else {
			out.writeUTF("");
		}

		if (city != null) {
			out.writeUTF(city);
		} else {
			out.writeUTF("");
		}

		if (product != null) {
			out.writeUTF(product);
		} else {
			out.writeUTF("");
		}		

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		state = in.readUTF();
		city = in.readUTF();
		product = in.readUTF();
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
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
	  return true;
    }
	
}
