package t3_constructor;

public class Test4_2 {
	
	String model;
	String color = "블랙";
	int speed; //초기값 이미 있음
	
	Test4_2(String model){ // #1
		this(model,"흰색",250);
		//지정을 해줌. 안 쓸거면 기본값 적어줌 예) (model,null,0)
	}
	
	Test4_2(String model, String color){ // #2
		this(model,color,250);
	} //앞의 두개는 받아서 뒤의 클래스로 넘김, 뒤의 상수는 사용함
	//this() -> 현재 클래스의 생성자 의미
	//this(model,color,250) -> (String, String, int)인 애를 찾아감
	
	Test4_2(String model, String color, int speed){ // #3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	//외부로부터 받는 값이 많은 걸 살려두고 나머지는 줄임
}
