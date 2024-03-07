package t6_exam;

public class Test_format {
	public static void main(String[] args) {
		int su = 1234000;
		double su2 = 1234000.123;
		String su3 = "1234000";
		
		System.out.printf("금액 : %,d\n", su); //출력 포맷에서 천단위로 콤마 넣는 방식
		System.out.printf("금액 : %,10d\n", su); //숫자 출력 칸 전체를 10자리 확보 후 쉼표 넣기
		System.out.printf("금액 : %,15.2f\n", su2); //앞부분과 같은 방식 + 소수점 표기
		
		System.out.println(String.format("%,15d", su)); //(양식기호,인자) -> 양식기호는 포맷 출력처럼 원하는 부분 작성
		
		System.out.println(String.format("%,15d", Integer.parseInt(su3))); //래퍼클래스 이용. parseInt: String을 int로 바꾼다
	}
}
