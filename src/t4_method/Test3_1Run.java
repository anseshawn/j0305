package t4_method;

public class Test3_1Run {
	public static void main(String[] args) {
		//static으로 선언한 건 메소드 영역에 들어감
		//메소드영역: (힙영역,스택영역, 객체가 모두 참조할수 있는 영역)
		int[] su = {90,80,100,70,60}; //스캐너로받기
		
		Test3_1 t3 = new Test3_1();
		
		int res = t3.hap(su);
		System.out.println("총합 : "+res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : "+res);
		
		res = t3.hap(new int[] {1,2,3,4,5});
		//()안에서 배열 새로 생성해도됨
		System.out.println("총합3 : "+res);
		
		res = t3.sum(new int[] {1,2,3,4,5});
		System.out.println("총합4 : "+res);
		
		//res = t3.hap({1,2,3,4,5}); //에러
		//res = t3.hap(1,2,3,4,5); //에러
		res = t3.sum(1,2,3,4,5); //됨
		System.out.println("총합5 : "+res);
	}
}
/*
	private static int hap() {
	//static메소드에서 메소드를 만들면 그 메소드는 무조건 static에 같이
	//자주쓰는 메소드는 static으로 붙이면 알아서 메소드영역으로 올라감
		return 0;
	} ==> Test3_1 비즈니스영역으로 이동해서 계속...
}
*/
