package t2_field;

public class Test_variable {
	int su3 = 10; //field 
	public void atom() { //void: 메소드에만 쓸수 있기 때문에 atom() (괄호필요) 라는 메소드 생성
		int su1 = 100; //전역 변수 global variable
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i; //지역 변수 local variable (블록 안에서만 사용하는 변수)
			System.out.println(su1 + su2);
		}
		
		su3 += su1; //메소드 밖에 있는 것은 변수가 아니라 필드기 때문에 static main 메소드 내에선 쓸 수없음
		System.out.println("su3 : " + su3);
		//현재는 출력되지 않음(JVM은 main 메소드만 찾는다)
	}
	
}
