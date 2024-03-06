package t3_constructor;
//Test3이랑 같이 볼것
public class Test3Run {
	public static void main(String[] args) {
		Test3 t3_1 = new Test3();
		//The constructor Test3() is undefined
		//기본 생성자가 없는데 쓰려고 하면 에러 발생
		Test3 t3_2 = new Test3(100);
		
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		
		t3_1.atom = 500; //원 클래스에서 전역변수에 값이 있더라도
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		
		t3_2.atom = 600;
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		System.out.println();
		
		Test3 t3_3 = new Test3(10, 20);
		//생성자의 역할: 객체를 생성할 때 초기값을 준다
		System.out.println("t3_3.atom : " +t3_3.atom);
		System.out.println("t3_3.atom : " +t3_3.atom2);
		
		t3_3.atom = -100;
		t3_3.atom2 = -200; //웹에서는 이 방법 사용하면 보안에 취약함
		System.out.println("t3_3.atom : " +t3_3.atom);
		System.out.println("t3_3.atom : " +t3_3.atom2);
		System.out.println();
		
		Test3 t3_4 = new Test3(70, 3.14);
		System.out.println("t3_3.atom : " +t3_4.atom);
		System.out.println("t3_3.atom : " +t3_4.atom3);
	}
}
