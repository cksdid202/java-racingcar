package controller;

import java.util.ArrayList;
import java.util.Random;

import model.Car;
import model.RacingCars;

public class RacingGame {
	final private static String runMessage = "실행 결과";
	final private static int RANDOM_NUMBER_RANGE = 10;
	final private static int MOVE_MINIMUM = 4;
	private static RacingCars cars;
	private static int tryCount;
	
	// 생성자
	public RacingGame(ArrayList<String> carNames, int tryCount) {
		cars = new RacingCars(carNames);
		this.tryCount = tryCount;
	}
	// 함수
	public static int getTryCount() {
		return tryCount;
	}
	// 랜덤 숫자 리턴
	private int getRandomNumber() {
		return new Random().nextInt(RANDOM_NUMBER_RANGE);
	}
	// 레이스 진행
	private void racing() {
		for (Car c : cars.getList()) {
			int randomNum = getRandomNumber();
			if(randomNum >= MOVE_MINIMUM)
				c.move();
			c.printNow();
		}
		System.out.println();
	}
	// 우승자 업데이트
	private void updateResult() {
		for(Car c : cars.getList()) {
			if(c.getDist() == tryCount) {
				c.win();
			}
		}
	}
	// 레이스 시작
	public void race() {
		System.out.println(runMessage);
		for(int i=0;i<tryCount;i++) {
			racing();
		}
		updateResult();
	}
	// 우승자목록 리턴
	public ArrayList<String> getWinners() {
		ArrayList<String> results = new ArrayList<>();
		for(Car c : cars.getList()) {
			if(c.getResult()) 
				results.add(c.getCarName());
		}
			
		return results;
		
	}
	

}
