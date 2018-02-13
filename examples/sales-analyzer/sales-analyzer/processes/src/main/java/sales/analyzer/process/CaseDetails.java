package sales.analyzer.process;

import javax.persistence.Column;
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

	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "CASEDETAILS_ID_GENERATOR")
	@Id
	@SequenceGenerator(name = "CASEDETAILS_ID_GENERATOR", sequenceName = "CASEDETAILS_ID_SEQ")
	private Long id;

	private String state;
	private String city;
	private String product;

    @Version
    @Column(name = "OPTLOCK")
    private int    version;
	
	
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

}
