package t6_exam;

import java.util.Scanner;

public class Test_objRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test_objService service = new Test_objService();
		Test_objVO[] data = new Test_objVO[100];//타입이 여러개이기 때문에 객체 배열 생성 
		
		int cnt = 0;
		
		while(true) {
			//배열 생성할때 반복할때마다 새로운 데이터가 새로운 객체로 저장되기 때문에
			// while문 안에서 객체 생성 (밖에서 생성하면 자료가 덮어씌워짐)
			Test_objVO vo = new Test_objVO();
			System.out.print("아이디를 입력하세요: ");
			vo.setMid(sc.next());
			System.out.print("비밀번호를 입력하세요: ");
			vo.setPwd(sc.next());
			System.out.print("성명을 입력하세요: ");
			vo.setName(sc.next());
			System.out.print("나이를 입력하세요: ");
			vo.setAge(sc.nextInt());
			
			// 처리할 내용들을 service 객체에서 처리시켜준다.
			vo.setAdult(service.adultCheck(vo.getAge())); //service에서 체크한 사항을 vo 필드에 저장
			
			// 처리된 자료를 배열에 저장한다.
			data[cnt] = vo;
			cnt++;
			
			System.out.print("계속 할까요?(Y/N) ");
			String yn = sc.next().toUpperCase(); //입력받은 글자를 대문자로 변환
			
			if(yn.equals("N")) break;
		}
		
		// 배열에 저장된 자료를 출력처리한다.
		service.memberPrint(data, cnt);
		
		sc.close();
	}
}
