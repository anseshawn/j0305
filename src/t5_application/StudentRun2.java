package t5_application;

import java.util.Scanner;

//실행
//객체지향형
public class StudentRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentVO vo = new StudentVO();
		
		System.out.print("번호를 입력하세요: ");
		vo.setNo(sc.nextInt());
		System.out.print("성명을 입력하세요: ");
		vo.setName(sc.next());
		System.out.print("나이를 입력하세요: ");
		vo.setAge(sc.nextInt());
		System.out.print("성별을 입력하세요(1:남자, 2:여자): ");
		int choice = sc.nextInt();
		if(choice == 1) vo.setGender(true);
		else vo.setGender(false);
		
		System.out.print("직업을 입력하세요: ");
		vo.setJob(sc.next());
		
		StudentService2 service = new StudentService2();
		service.print(vo);
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}  //set로 입력, service로 처리, print에서 vo 프린트
}
