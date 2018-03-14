package admin;

import mini_jokiyo.admin.ui.AdminUI;

public class Test {
	public static void main(String[] args) {
		AdminUI ui = new AdminUI();
		try {
			ui.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
