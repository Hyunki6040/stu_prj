package poly.dto;


public class UserDTO {

	private int user_no; //회원 번호
	private String stu_no; //학번
	private String password; //비밀번호
	private String reg_dt; //가입일
	private String barcode_no; //바코드 번호
	
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getStu_no() {
		return stu_no;
	}
	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getBarcode_no() {
		return barcode_no;
	}
	public void setBarcode_no(String barcode_no) {
		this.barcode_no = barcode_no;
	}
}
