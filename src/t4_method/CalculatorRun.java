package t4_method;

import java.util.Scanner;

//두수와 연산자를 입력하면 해당 결과를 출력하는 프로그램...
public class CalculatorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 수를 입력하세요: ");
			int su1 = sc.nextInt();
			System.out.print("연산자?: ");
			String operator = sc.next();
			System.out.print("두번째 수를 입력하세요: ");
			int su2 = sc.nextInt();
			
			Calculator calc = new Calculator();
			calc.calc(su1, su2, operator);
			
			System.out.print("계속 하시겠습니까?(Y/N) ");
			String ans = sc.next();
			
			//if(ans.charAt(0) == 'N' || ans.charAt(0) == 'n') break; //no 로 입력해도 종료
			//if(ans.equals("N") || ans.equals("n")) break; //n 이라고 적어야만 종료
			//if(ans.toUpperCase().equals("N")) break; //ans에 들어오는 문자열이 전부 대문자로 바뀜
			if(ans.toLowerCase().equals("n")) break; //ans에 들어오는 문자열이 전부 소문자로 바뀜
		}
		System.out.println("작업끝~~~~");
		sc.close();
	}
}
