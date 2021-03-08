package com.greedy.collection.silsub.controller;

import java.util.ArrayList;

import com.greedy.collection.silsub.model.comparator.AscCategory;
import com.greedy.collection.silsub.model.comparator.DescCategory;
import com.greedy.collection.silsub.model.vo.BookVO;

public class BookManager {
	
	private ArrayList<BookVO> bookList;
	
	
	public BookManager() {
		
		bookList = new ArrayList<BookVO>();
	}
	
	
	public void addBook(BookVO book) {
		bookList.add(book);
	}
	
	
	public void deleteBook(int no) {
		
		bookList.remove(no);
	}
	
	
	public int searchBook(String title) {
		int searchResult = -1;
		for(int i = 0; i < bookList.size(); i++) {
			
			if((bookList.get(i).getTitle()).equals(title)) {
				searchResult = i;
			}
		}
		return searchResult;
	}
	
	
	public void printBook(int index) {
		
		System.out.println("도서번호" + index + " : " + bookList.get(index));
		
	}
	
	
	public ArrayList<BookVO> displayAll(){
		
		return bookList;
	}
	
	
	public BookVO[] sortedBookList(int select) {
		
		if(select == 1) {
			bookList.sort(new AscCategory());
		} else {
			bookList.sort(new DescCategory());
		}
		
		System.out.println(bookList.size());
		BookVO[] bookVO = new BookVO[bookList.size()];
		
		for(int i = 0; i < bookList.size(); i++) {
			bookVO[i] = bookList.get(i);
		}
		return bookVO;
	}	
	
	
	public void printBookList(BookVO[] br) {

		for(BookVO printList : br) {
			System.out.print(printList + " ");
		}
		System.out.println();
	}
	
	
}
