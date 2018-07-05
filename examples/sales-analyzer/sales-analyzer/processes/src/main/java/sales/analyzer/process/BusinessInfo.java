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

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		state = in.readInt();
		city = in.readInt();
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
