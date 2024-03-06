package t5_application;
//사용할 변수
//객체이름: Value Object(VO) -> 변수 관리 객체

//Data Transfer Object(DTO) -> 데이터를 가지고 옮겨주기 위한 객체
//VO와 DTO의 차이점 알아두기

public class StudentVO { //필드를 관리하는 객체
	private int no;
	//run에서 직접 지정(vo.no = sc.nextInt())으로 접근하지 못함
	//(getter setter만으로 접근)
	String name;
	int age;
	boolean gender;
	String job;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

	//변수에 값을 받는 메소드를 하나 만들어야함
	//받는 거는 받기만 함(저장만 하면 됨)(return 없어도 됨)
	//읽는 거는 읽어서 돌려줘야 함(return이 있어야 함)
	//저장: set , 읽어오는 것: get / 저장하는 객체: setter, 읽어오는 객체: getter
	/* void setNo(int no) { //번호를 저장한다(약속)
		this.no = no;
	}
	
	int getNo() { //번호를 리턴한다
		return no;
	}
	*/
	
	//단축키: getNo + ctrl + Space
	//메뉴(혹은 우클릭) source -> Generate Getters and Setters

	//boolean 타입이기 때문에 is
	
	
	
	
}
