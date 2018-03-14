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
		System.out.println("1. 전체 조회");
		System.out.println("2. 식당 추가");
		System.out.println("3. 식당 수정");
		System.out.println("4. 식당 삭제");
		System.out.println("================");
		System.out.print("처리할 항목을 선택하세요 : ");
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
//		System.out.println("1. 전체 보기");
//		System.out.println("2. 식당 추가");
//		System.out.println("3. 식당 수정");
//		System.out.println("4. 식당 삭제");
//		System.out.println("5. 뒤로 가기");
//		System.out.println("===============");
//		System.out.print("번호를 선택하세요 : ");
//		
//		
//		return Integer.parseInt(sc.nextLine());
//		}
//	}


