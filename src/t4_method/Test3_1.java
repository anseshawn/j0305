package t4_method;

public class Test3_1 {

	public int hap(int[] su) {
		int hap = 0;
		for(int i=0; i<su.length; i++) {
			hap += su[i];
		}
		return hap;
	}

	public int sum(int ... su) {
		//배열에서 여러값이 넘어올때 ... 사용
		//배열 말고도 무작위로 몇개의 값을 던질지 모를때 사용
		int sum = 0;
		for(int i=0; i<su.length; i++) {
			sum += su[i];
		}
		return sum;
	}
	
}
