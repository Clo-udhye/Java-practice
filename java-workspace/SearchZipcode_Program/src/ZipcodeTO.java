
public class ZipcodeTO {
	// table의 칼럼과 1대 1 맵핑
	// select문의 칼럼과 맵핑
	
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String ri;
	private String bunji;
	private String seq;
	
	// 생성자 - setter대용
	public ZipcodeTO(String zipcode, String sido, String gugun, String dong, String ri, String bunji, String seq) {
		this.zipcode = zipcode;
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.ri = ri;
		this.bunji = bunji;
		this.seq = seq;
	}

	// getter
	public String getZipcode() {
		return zipcode;
	}

	public String getSido() {
		return sido;
	}

	public String getGugun() {
		return gugun;
	}

	public String getDong() {
		return dong;
	}

	public String getRi() {
		return ri;
	}

	public String getBunji() {
		return bunji;
	}

	public String getSeq() {
		return seq;
	}
	
	
}
