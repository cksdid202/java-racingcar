package model;

public class Car {
	
	final private String carName;
	private int dist = 0;
	private boolean winCheck = false;
	
	// 생성자
	public Car(String carName) {
		this.carName = carName;
	}
	
	// 함수
	public String getCarName() {
		return carName;
	}
	public void move() {
		dist++;
	}
	public int getDist() {
		return dist;
	}
	public void printNow() {
		System.out.print(carName + " : ");
		for(int i=0;i<dist;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public void win() {
		winCheck = true;
	}
	public boolean getResult() {
		return winCheck;
	}

}
