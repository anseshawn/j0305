package t8_static;

public class T2_staticBlock {
	int field1;
	static int field2;
	
	void method1() {}
	static void method2() {}
	
	//정적블록
	static {
		// field1 = 100; 에러 - 정적블록은 정적필드,정적메소드만 불러올 수 있다
		field2 = 200;
		method2();
	}
}
