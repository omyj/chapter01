package chapter01;

public class Student {
	
	String number; 		// 학번 ;02,03등으로 시작하는 경우 때문 int를 안씀
	String name; 		// 이름
	boolean isEnrolled; // 등록 여부
	int grade;			// 평점
	String address; 	// 주소
	String major; 		// 전공
	int unit; 			// 이수 학점
	boolean haveMinor; 	// 부전공 여부
	String juminNo;		// 주민번호(-없이 13자리숫자) ;000125-1234567같은 예로 int를 안씀
	String cellphone; 	// 핸드폰 번호(-포함한 숫자)
	int age; 			// 나이
	String email; 		// 이메일주소
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEnrolled() {
		return isEnrolled;
	}
	public void setEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public boolean isHaveMinor() {
		return haveMinor;
	}
	public void setHaveMinor(boolean haveMinor) {
		this.haveMinor = haveMinor;
	}
	public String getJuminNo() {
		return juminNo;
	}
	public void setJuminNo(String juminNo) {
		this.juminNo = juminNo;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
