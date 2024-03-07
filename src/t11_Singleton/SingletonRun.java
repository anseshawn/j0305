package t11_Singleton;

public class SingletonRun {
	public static void main(String[] args) {
		// new Singleton(); /private로 선언했기 때문에 접근 불가능
		
		Singleton.getInstance(); //클래스.메소드로 접근
	}
}
