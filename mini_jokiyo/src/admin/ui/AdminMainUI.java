package admin.ui;

import java.util.Scanner;

import admin.mapper.RestMapper;
import admin.rest.ui.RestUI;
import admin.stat.ui.StatUI;
import admin.user.ui.UserUI;

public class AdminMainUI {
	private static Scanner sc = new Scanner(System.in);
	
	public void service() throws Exception {
		RestUI rui = null;
		UserUI uui = null;
		StatUI sui = null;
		
		switch (menu()) {
			case 1: rui = new RestUI();
					rui.service(); 
					break;
			case 2: uui = new UserUI();
			        uui.service();
			        break;
			case 3: sui = new StatUI();
			        sui.service();
			        break;
			}
	}

	private static int menu() {
		System.out.println("==================");
		System.out.println("1. 식당관리");
		System.out.println("2. 유저관리");
		System.out.println("3. 통계관리");
		System.out.println("==================");
		System.out.print("번호를 입력하세요 : ");
        
		return Integer.parseInt(sc.nextLine());
	
	}




}
