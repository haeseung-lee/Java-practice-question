package com.greedy.collection.silsub.view;

import java.util.Scanner;

import com.greedy.collection.silsub.controller.BookManager;
import com.greedy.collection.silsub.model.vo.BookVO;

public class BookMenu {

	private Scanner sc;
	private BookManager bm;
	
	public BookMenu() {}
	
	
	public void menu() {
		
		bm = new BookManager();
		
		while(true) {
			System.out.println("도서 관리 프로그램");
			System.out.println("1. 새도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			
			
			sc = new Scanner(System.in);
			
			switch(sc.nextInt()) {
				
				case 1 :

					bm.addBook(inputBook());
					break;
					
				case 2 :
					System.out.println("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순)");
					int sortNum = sc.nextInt();
					
					if(sortNum == 1 || sortNum ==2) {
						bm.printBookList(bm.sortedBookList(sortNum));
					} else {	
						System.out.println("번호를 잘못 입력하셨습니다."); 
					}
					break;
					
				case 3 :
					System.out.println("삭제할 도서의 제목을 입력해주세요.");
					sc.nextLine();
					int removeNum = bm.searchBook(sc.nextLine());
					
					if(removeNum == -1) {
						System.out.println("삭제할 글이 존재하지 않음");
					} else {
						bm.deleteBook(removeNum);
						System.out.println("성공적으로 삭제");
					}
					break;
					
				case 4 :
					
					int searchNum = bm.searchBook(inputBookTitle());
					
					if(searchNum == -1) {
						System.out.println("조회한 도서가 존재하지 않음");
					} else {
						bm.printBook(searchNum);
					}
					break;
					
				case 5 :
					if(bm.displayAll().isEmpty()) {
						System.out.println("출력할 도서가 없습니다.");
					} else {
						System.out.println(bm.displayAll());	
					}
					break;
					
				case 6 :
					System.out.println("끝내기"); 
					return;
			}
			System.out.println();
		}
	}
	

	public BookVO inputBook() {
		
		System.out.print("도서 제목 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("도서 장르 : 1.인문 / 2.자연과학 / 3.의료 / 4.기타  : ");
		int category = sc.nextInt();
		while(category < 1 || category >4) {
			System.out.println("장르를 다시 입력해주세요");
			System.out.print("도서 장르 : 1.인문 / 2.자연과학 / 3.의료 / 4.기타  : ");
			category = sc.nextInt();
		}
		sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		BookVO bookVO = new BookVO(category, title, author);
		
		return bookVO;
	}
	
	
	public String inputBookTitle() {
		
		System.out.println("도서 제목 : ");
		sc.nextLine();
		return sc.nextLine();
	}
}
