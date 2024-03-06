package t5_application;
//사용할 로직
public class StudentService {

	void print(int no, String name, int age, boolean gender, String job) {
		String genderOk = genderCheck(gender); //해당메소드에서 리턴하는 타입으로 받아야 함
		
		String ageOk;
		if(ageCheck(age)) ageOk = "성인";
		else ageOk = "미성년";
		
		System.out.println("번호: "+no+", 성명: "+name+", 나이: "+age+", 성별: "+genderOk+", 직업: "+job+", 비고: "+ageOk);
	}	
	
	String genderCheck(boolean gender) {
		String res = "";
		//if(gender == true)
		if(gender) res ="남자"; //같은 의미(어차피 if는 true나 false가 된다) //-> true를 참으로 보겠다
		else res = "여자";
		return res;
	}
	
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;		
	}
	
}
