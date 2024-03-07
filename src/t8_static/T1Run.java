package t8_static;

public class T1Run {
	public static void main(String[] args) {
		T1 t1= new T1();
		
		System.out.println("pi : "+t1.pi);
		
		double area = t1.circleArea(10);
		System.out.println("반지름 10인 원 넓이 : "+area);
		
		double area2 = T1.circleArea(20);
		//static으로 정의되었으므로 클래스에서 바로 불러옴
		System.out.println("반지름 20인 원 넓이 : "+area2);
	}
}
