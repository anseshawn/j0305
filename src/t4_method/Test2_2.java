package t4_method;

public class Test2_2 {
	//클래스를 실행 파일에 올려야 메소드 사용가능
	void mod1() {
		System.out.println("안녕");
	}
	
	int mod2(int su1) {
		// return 10;
		return su1; //여기서 su1 -> 리턴값
		//리턴 값이 리턴 타입에 맞게 정의되어있으면 에러는 나지 않는다.
	}
		
	int mod1(int su1) {
		return su1;
	}
	
	int add(int su1, int su2) {
		return su1 + su2;
	}
	
	//빼기 (sub)
	int sub(int su1, int su2) {
		return su1 - su2;
	}
	
	//곱하기(mul)
	int mul(int su1, int su2) {
		return su1 * su2;
	}
	
	//나누기(div)
	double div(int su1, int su2) {
		return (double)su1 / su2;
	}
	
	void prn(int su1, int su2, int res, String operator) {
		System.out.println(su1 + operator + su2+" = "+res);
	}
}
