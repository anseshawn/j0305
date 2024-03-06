package t3_constructor;

public class Test2 {
	// 기본생성자
	Test2() {} // 생성자는 클래스명과 같다, 괄호와 블록이 있다
	// 사용자 정의 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 생성하지 않는다
	Test2(int su1) {}
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(double su2, int su1) {}
	
	//Test2(int atom1, int atom2) {} => 에러발생
	//overloading은 변수명과는 관계 없음 (타입의 개수, 순서) (변수명은 중요하지 않다)
}
