package view;

import java.util.ArrayList;

public class OutputView {

	public static void printWinners(ArrayList<String> results) {
		if(results.size()==0) {
			System.out.println("우승자 없음.");
			return;
		}
		for(int i=0;i<results.size();i++) {
			System.out.print(results.get(i));
			if(i==results.size()-1)
				break;
			System.out.print(", ");
		}
		System.out.println("가 최종 우승했습니다.");
	}
	
}
