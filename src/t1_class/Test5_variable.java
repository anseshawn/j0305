package t1_class;

public class Test5_variable {

	public static void main(String[] args) {
		int su1 = 100, su3; //전역 변수 global variable
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i; //지역 변수 local variable (블록 안에서만 사용하는 변수)
			System.out.println(su1 + su2);
		}
		
		//su3 = su1 + su2;
	}
}
