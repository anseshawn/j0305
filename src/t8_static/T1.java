package t8_static;

public class T1 {
	// 인스턴스 필드
	//double pi = 3.141592;
	
	// 정적 필드(with static...)->메소드영역에 올라감. 객체생성 안하고 클래스 이름으로 불러옴 
	public static double pi = Math.PI;
	
	// 인스턴스 메소드
	static double circleArea(int r) {
		double res =  r * r * pi;
		return res;
	}
}
