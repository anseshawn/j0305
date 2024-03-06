package t5_application;
//사용할 로직
public class StudentService2 {

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

	public void print(StudentVO vo) {
		String genderOk = genderCheck(vo.isGender());		
		String ageOk;
		if(ageCheck(vo.getAge())) ageOk = "성인";
		else ageOk = "미성년";
		
		System.out.println("번호: "+vo.getNo()+", 성명: "+vo.getName()+", 나이: "+vo.getAge()+", 성별: "+genderOk+", 직업: "+vo.getJob()+", 비고: "+ageOk);
	}
	
}
