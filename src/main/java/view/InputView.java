package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputView {
	
	final private static String startMessage = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
	final private static String str1 = "시도할 횟수는 몇회인가요?";
	final private static Scanner in = new Scanner(System.in);
	
	// 자동차 이름 입력받기
	public static ArrayList<String> getCarNames() {
		System.out.println(startMessage);
		String input = in.next();
		String[] carNames = input.split(",");
		
		ArrayList<String> nameList = new ArrayList<>();
		nameList.addAll(Arrays.asList(carNames));
		
		return nameList;
	}
	// 시도 횟수 입력받기
	public static int getTryCount() {
		System.out.println(str1);
		
		int tryCount = in.nextInt();
		System.out.println();
		
		return tryCount;
		
	}

}
