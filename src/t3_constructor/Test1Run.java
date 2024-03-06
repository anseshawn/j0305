package t3_constructor;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1(); //보조기억장치에있던 Test1을 new로 불러옴으로써 JVM이 힙영역에 올린다
		
		System.out.println("t1 : "+ t1);
		// t1 : t3_constructor.Test1@15db9742
		// 패키지명.클래스명@메모리주소(16진수로 표현)
		System.out.println("t1 : "+ t1.toString());
	}	
}
