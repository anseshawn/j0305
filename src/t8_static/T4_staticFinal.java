package t8_static;

public class T4_staticFinal {
	static final String NATION = "Korea"; //관례상 상수는 대문자
	final String jumin;
	String name;
	
	T4_staticFinal(String jumin){
		this.jumin = jumin;
	}
	
	public String getNation() {
		return NATION;
	}
}
