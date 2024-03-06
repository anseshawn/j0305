package t3_constructor;

public class Test3 {
	// 기본생성자
	Test3() {} // #1
	// 생성자는 클래스명과 같다, 괄호와 블록이 있다
	// 사용자 정의 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 생성하지 않는다
	
	int atom = 30;
	int atom2;
	double atom3;
	
	Test3(int su1) { // #2
		System.out.println("su1 : "+ su1);
	}
	
	Test3(int su1, int su2) { // #3
		atom = su1;
		atom2 = su2; //보통 이렇게쓰진 않음. 변수 이름은 동일하게 사용한다
	}
	
	Test3(int atom, double atom3) { // #4
		//매개변수로(괄호안에) 선언한 변수는 중괄호 블록을 벗어나면 초기화
		//atom = atom; 해도 run에서 받아쓰면 필드에서 선언한 초기값으로 됨
		this.atom = atom; //필드 = 매개변수; 필드라고 알려주기 위해 this. 사용
		this.atom3  = atom3; 
	}
	
	Test3(double su2, int su1) {}
	
	//Test2(int atom1, int atom2) {} => 에러발생
	//overloading은 변수명과는 관계 없음 (타입의 개수, 순서) (변수명은 중요하지 않다)
}
