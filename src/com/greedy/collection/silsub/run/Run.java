package com.greedy.collection.silsub.run;

import java.util.Scanner;

import com.greedy.collection.silsub.view.BookMenu;

public class Run {
	
	public static void main(String[] args) {
		
		BookMenu menu = new BookMenu();
		Scanner sc = new Scanner(System.in);
		menu.menu();
		
	}
}
