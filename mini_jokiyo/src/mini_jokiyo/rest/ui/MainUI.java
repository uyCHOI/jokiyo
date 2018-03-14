package mini_jokiyo.rest.ui;

import java.util.Scanner;

public class MainUI {
	Scanner sc = new Scanner(System.in);
	MainUI ui = new MainUI();
	public void service() {
		while(true) {
			switch(menu()) {
			case 1: ui.exitList();
			case 2:
			}
		}
	}
	
	
	
	public int menu() {
		System.out.println("=================");
		System.out.println("1. 강남역 출구번호별로 선택 ");
		System.out.println("2. 메뉴별 선택");
		System.out.println("==================");
		System.out.println("메뉴를 입력하세요 :");
		return Integer.parseInt(sc.nextLine());

		
	}
	
	public int exitList() {
		// 강남역 출구 번호별 선택 
		System.out.println("출구 번호를 입력하세요 :");
		return Integer.parseInt(sc.nextLine());
		
	}

}
