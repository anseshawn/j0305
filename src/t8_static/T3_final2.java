package t8_static;

public class T3_final2 {
	final String nation = "Korea";
	final String jumin;
	String name;
	
//	public T3_final2() {}
	
	T3_final2(String jumin){
		//final 로 선언하게 되면 setter로 값을 줄 수 없음. 생성자로 생성할때 값을 넘겨줘야 함
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
}
