package t4_method;

import java.util.Scanner;

public class Test2_1Run {
	public static void main(String[] args) {
		Test2_1 t2 = new Test2_1(); //클래스 사용하기 위해 올려놓기
		int res;
		
		t2.mod1();
		res = t2.mod2(50); //메소드에서 넘겨주는 타입으로 값을 받아야함
		System.out.println("res : "+ res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int su2 = sc.nextInt();
		
		res = t2.add(su1, su2);
		System.out.println(su1+" + "+su2+" = "+res);
		
		//뺄셈
		res = t2.sub(su1, su2);
		System.out.println(su1+" - "+su2+" = "+res);
		
		//곱셈
		res = t2.mul(su1, su2);
		System.out.println(su1+" * "+su2+" = "+res);
		
		//나눗셈 소숫점이하한자리까지만 출력
		double res2 = t2.div(su1, su2);
		System.out.printf("%d / %d = %.1f",su1,su2,res2);
		
		
		sc.close();
	}
}