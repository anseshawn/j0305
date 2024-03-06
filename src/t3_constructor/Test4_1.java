package t3_constructor;

public class Test4_1 {
	
	String model;
	String color = "블랙";
	int speed; //초기값 이미 있음
	
	Test4_1(String model){ // #1
		this.model = model; //외부에서 받은 값을 this 에 넘겨서 처리
		this.color = "흰색";
		this.speed = 250;
	}
	
	Test4_1(String model, String color){ // #2
		this.model = model;
		this.color = color;
		this.speed = 250;
	}
	
	Test4_1(String model, String color, int speed){ // #3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
}
