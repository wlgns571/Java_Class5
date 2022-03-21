package java_day18.Worldcup;

import java.util.ArrayList;
import java.util.Scanner;

public class WorldCupMain {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Menu menu2 = new Menu("짜장면", false);
		System.out.println(menu2);

		// menu2.name; private이기 때문에 수정 안됨
		System.out.println(menu2.getName());

		ArrayList<Menu> menuList = new ArrayList<Menu>();

		menuList.add(new Menu("짜장면"));
		menuList.add(new Menu("짬뽕"));
		menuList.add(new Menu("탕수육"));
		menuList.add(new Menu("양장피"));
		menuList.add(new Menu("팔보채"));
		menuList.add(new Menu("울면"));
		menuList.add(new Menu("잡채밥"));
		menuList.add(new Menu("볶음밥"));
		menuList.add(new Menu("깐풍기"));
		menuList.add(new Menu("꿔바로우"));
		menuList.add(new Menu("제육볶음"));
		menuList.add(new Menu("라조기"));
		menuList.add(new Menu("냉면"));
		menuList.add(new Menu("짬짜면"));
		menuList.add(new Menu("탕짜면"));
		menuList.add(new Menu("탕짬면"));

		Scanner sc = new Scanner(System.in);

		// 16강 
		// 0:1 | 2:3 | 4:5 | ...
		System.out.println("16강");
		for (int i = 0; i < menuList.size(); i += 2) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. " + menuList.get(i).getName() + " | 2. " + menuList.get(i + 1).getName());
			System.out.print(">>> ");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				menuList.get(i).setSelect(true);
			} else if (select == 2) {
				menuList.get(i + 1).setSelect(true);
			}
		}
		
		// 8강
		System.out.println("8강");
		ArrayList<Menu> menuList8 = trueList(menuList);
		for (int i = 0; i < menuList8.size(); i += 2) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. " + menuList8.get(i).getName() + " | 2. " + menuList8.get(i + 1).getName());
			System.out.print(">>> ");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				menuList8.get(i).setSelect(true);
			} else if (select == 2) {
				menuList8.get(i + 1).setSelect(true);
			}
		}
		
		// 준결승
		System.out.println("4강");
		ArrayList<Menu> menuList4 = trueList(menuList);
		for (int i = 0; i < menuList4.size(); i += 2) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. " + menuList4.get(i).getName() + " | 2. " + menuList4.get(i + 1).getName());
			System.out.print(">>> ");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				menuList4.get(i).setSelect(true);
			} else if (select == 2) {
				menuList4.get(i + 1).setSelect(true);
			}
		}
		
		//결승
		System.out.println("결승");
		ArrayList<Menu> menuList2 = trueList(menuList);
		for (int i = 0; i < menuList2.size(); i += 2) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. " + menuList2.get(i).getName() + " | 2. " + menuList2.get(i + 1).getName());
			System.out.print(">>> ");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				menuList2.get(i).setSelect(true);
			} else if (select == 2) {
				menuList2.get(i + 1).setSelect(true);
			}
		}
		for (Menu m : menuList2) {
			if (m.isSelect()) {
				System.out.println(m.getName() + " 우승!!");
			}
		}
		
	} // main
	
	public static ArrayList<Menu> trueList(ArrayList<Menu> list) {
		ArrayList<Menu> selectList = new ArrayList<Menu>();
		for (Menu menu : list) {
			if (menu.isSelect()) {
				selectList.add(new Menu(menu.getName()));
			}
		}
		return selectList;
	}
}
