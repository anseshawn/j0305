package t3_constructor;

public class Test5VO {
	private String name; //앞으로 접근제한자 붙이기
	private String mid;
	private String password;
	private int age;
	private boolean gender;
	private String address;
	
	
	
	//생성자(클래스와 이름 같음, 반환타입 없음) (기본생성자가 없어지므로 기본생성자를 따로 만들어야함 ctrl+Space)	
	/* public Test5VO(String name, String mid, String password, int age, boolean gender, String address) {
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	*/
	public Test5VO() {
		// TODO Auto-generated constructor stub
	}
	
	public Test5VO(String name, String mid, String password, int age, boolean gender, String address) {
		super();
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	//alt+s -> r -> alt+a -> alt+r : 전체 getter setter 생성
	//getter + setter -> 유효성 검사를 실시한다(예: 잔고보다 많이 출금하면 안된다거나, 회원가입 나이제한 걸린다거나 등등)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
