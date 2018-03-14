package admin.rest.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import admin.rest.mapper.RestMapper;
import admin.ui.AdminMainUI;

public class RestUI {
	private RestMapper mapper;
	private Scanner sc = new Scanner(System.in);
	public RestUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(RestMapper.class);
	}
	

	public void service() throws Exception{
		BaseUI ui = null;
		AdminMainUI amui = new AdminMainUI();
		while(true) {
			switch (menu()) {
			case 1: ui = new ListRestUI(mapper); break;
			case 2: ui = new WriteRestUI(mapper); break;
			case 3: ui = new UpdateRestUI(mapper); break;
			case 4: ui = new DeleteRestUI(mapper); break;
			case 0: amui.service(); break;
			}
		}
		
	}


	private int menu() {
		System.out.println("================");
		System.out.println("1. ��ü ��ȸ");
		System.out.println("2. �Ĵ� �߰�");
		System.out.println("3. �Ĵ� ����");
		System.out.println("4. �Ĵ� ����");
		System.out.println("================");
		System.out.print("ó���� �׸��� �����ϼ��� : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
//	private RestMapper dao;
//	private Scanner sc = new Scanner(System.in);
//
//	public RestUI(RestMapper dao) {
//		this.dao = dao;
//	}
//
//	@Override
//	public int service() {
//		BaseUI ui = null;
//		swich(menu()){
//			case 1: ui = new ListRestUI(dao); break;
//			case 2: ui = new WriteRestUI(dao); break;
//			case 3: ui = new UpdateRestUI(dao); break;
//			case 4: ui = new DeleteRestUI(dao); break;
//			case 0: break;
//		}
//		
//		private static int menu() {
//		System.out.println("===============");
//		System.out.println("1. ��ü ����");
//		System.out.println("2. �Ĵ� �߰�");
//		System.out.println("3. �Ĵ� ����");
//		System.out.println("4. �Ĵ� ����");
//		System.out.println("5. �ڷ� ����");
//		System.out.println("===============");
//		System.out.print("��ȣ�� �����ϼ��� : ");
//		
//		
//		return Integer.parseInt(sc.nextLine());
//		}
//	}


