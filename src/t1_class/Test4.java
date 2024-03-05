package t1_class;

public class Test4 { // 현재 Test1과 Test4가 같은 위치에 있기 때문에 가져다 쓸 수 있음
	// 예시: Test1에 있는 설계도를 가지고 Test4에 인스턴스를 만듦
	public static void main(String[] args) {
		Test1 t1 = new Test1(); // Test1 클래스에 의해서 Test1이라는 객체가 생성되어 만들어짐
		// 힙 메모리에 Test1이라는 설계도가 올라옴
		// Test1(변수타입) t1(변수이름) = new Test1();(힙메모리에 Test1 올려놓음)
		// 변수인 t1으로 스택에서 힙메모리에 올라간 Test1을 사용
		Test1 t2 = new Test1(); //t1의 Test1() 랑은 다른 객체 (new를 이용하여 새로 생성했기 때문)
		
		if(t1 == t2) {
			System.out.println("t1객체와 t2객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t2객체는 서로 다른 객체입니다.");
		}
		
		Test1 t3;
		t3 = t1;
		if(t1 == t3) {
			System.out.println("t1객체와 t3객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t3객체는 서로 다른 객체입니다.");
		}
		
		Test1 t4 = null; //객체는 초기값을 null을 줄 수 있다
		if(t1 == t4) {
			System.out.println("t1객체와 t4객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t4객체는 서로 다른 객체입니다.");
		}
		
		if(t4 == null) {
			System.out.println("t4는 null입니다.");
		}
		else {
			System.out.println("t4는 null이 아닙니다.");
		}

		// NullPointerException에러.(비교할 게 없음(실행오류)) null과 비교할 때는 == / != 로 비교해야함
//		if(t4.equals(null)) { 
//			System.out.println("t4는 null입니다.");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다.");
//		}
	}
}
