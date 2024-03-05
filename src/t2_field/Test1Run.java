package t2_field;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1(); //Test1생성자 생성 클래스이름 = 생성자이름
		
		System.out.println(t1.su1); //초기값을 설정하지 않아도 참조타입이라서 초기값이 주어짐 
		System.out.println(t1.su2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);
		System.out.println();
		
		Test2 t2 = new Test2();
		System.out.println("t2.name : "+ t2.name);

		Test2 t3 = new Test2(); //t2와 클래스는 같지만 다른 객체
		System.out.println("t3.name : "+ t3.name);
		t3.name = "김말숙";
		System.out.println("t3.name : "+ t3.name);
	}
}
