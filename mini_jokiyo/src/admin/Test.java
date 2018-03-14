package admin;

import admin.ui.AdminMainUI;

public class Test {
	public static void main(String[] args) {
		AdminMainUI ui = new AdminMainUI();
		try {
			ui.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
