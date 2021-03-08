package com.greedy.collection.silsub.model.vo;

import java.util.Scanner;

public class BookVO {

	private int bNo;
	private int category;
	private String title;
	private String author;
	
	public BookVO() {}
	
	
	public BookVO( int category, String title,  String author) {
		
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	
	public void setBNo(int bNo) {
		this.bNo = bNo;
	}
	
	
	public void setCategory(int category) {
		this.category = category;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getBNo() {
		return bNo;
	}
	
	
	public int getCategory() {
		return category;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public String getAuthor() {
		return author;
	}

	
	@Override
	public String toString() {
		String categoryName = "";
		switch(category) {
			case 1 : categoryName = "인문"; break;
			case 2 : categoryName = "자연과학"; break;
			case 3 : categoryName = "의료"; break;
			case 4 : categoryName = "기타"; break;
		}
		
		return category + " : " + categoryName + ", " + title + ", "+ author;
	}
	
	
	
	
}
