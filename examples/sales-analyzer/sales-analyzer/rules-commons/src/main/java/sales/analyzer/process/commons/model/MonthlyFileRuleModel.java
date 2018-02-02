package sales.analyzer.process.commons.model;

public class MonthlyFileRuleModel {

	private Long country_id;
	private Long id_state;
	private Long id_city;
	private String product;
	private String name_country;
	private String name_state;
	private String name_city;
	private Float amount;
	private java.util.Date date;
	private Float month_1_amount;
	private Float month_2_amount;
	private Float month_3_amount;
	private boolean willCaseGenerate = false;
	
	public boolean isWillCaseGenerate() {
		return willCaseGenerate;
	}
	public void setWillCaseGenerate(boolean willCaseGenerate) {
		this.willCaseGenerate = willCaseGenerate;
	}
	public Long getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}
	public Long getId_state() {
		return id_state;
	}
	public void setId_state(Long id_state) {
		this.id_state = id_state;
	}
	public Long getId_city() {
		return id_city;
	}
	public void setId_city(Long id_city) {
		this.id_city = id_city;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getName_country() {
		return name_country;
	}
	public void setName_country(String name_country) {
		this.name_country = name_country;
	}
	public String getName_state() {
		return name_state;
	}
	public void setName_state(String name_state) {
		this.name_state = name_state;
	}
	public String getName_city() {
		return name_city;
	}
	public void setName_city(String name_city) {
		this.name_city = name_city;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public Float getMonth_1_amount() {
		return month_1_amount;
	}
	public void setMonth_1_amount(Float month_1_amount) {
		this.month_1_amount = month_1_amount;
	}
	public Float getMonth_2_amount() {
		return month_2_amount;
	}
	public void setMonth_2_amount(Float month_2_amount) {
		this.month_2_amount = month_2_amount;
	}
	public Float getMonth_3_amount() {
		return month_3_amount;
	}
	public void setMonth_3_amount(Float month_3_amount) {
		this.month_3_amount = month_3_amount;
	}

	

}
