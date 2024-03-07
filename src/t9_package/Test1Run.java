package t9_package;

import t4_method.Calculator;
import t4_method.Test2_1;
import t4_method.Test3_1;

//import t4_method.*;
//t4_method 패키지 밑에 있는 모든 클래스를 참조하겠다는 의미 (바람직하진 않음)

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("1. 번호 : "+t1.getNo());
		System.out.println("1. 성명 : "+t1.getName());
		
		t1.setNo(10);
		t1.setName("홍길동");
		System.out.println("2. 번호 : "+t1.getNo());
		System.out.println("2. 성명 : "+t1.getName());
		
		System.out.println("t8_staticdml.T1의 PI : "+t8_static.T1.pi);
		//접근제한자 때문에 에러 (public / default / private)
		//private: 자기 클래스 안에서만 사용
		//접근제한자를 안 붙이면 default가 붙음(default: 자기 패키지 안에서 사용)
		//public: 완전 허용
		
		t7_instance.Test1 t7 = new t7_instance.Test1();
		System.out.println("t7_instance.Test1의 PI : "+t7.pi);
		//인스턴스 필드 값은 그대로 못 가져오기 때문에(main 메소드는 static이니까)
		//패키지랑 메소드를 객체로 불러와서 사용
		
		new Calculator(); //import로 불러왔기 때문에 간략화
		new Test2_1();
		new Test3_1();
		
	}
}
