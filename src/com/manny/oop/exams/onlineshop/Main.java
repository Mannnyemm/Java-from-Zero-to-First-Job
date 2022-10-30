package com.manny.oop.exams.onlineshop;

import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
