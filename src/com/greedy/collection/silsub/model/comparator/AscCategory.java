package com.greedy.collection.silsub.model.comparator;

import java.util.Comparator;

import com.greedy.collection.silsub.model.vo.BookVO;

public class AscCategory implements Comparator<BookVO>{

	@Override
	public int compare(BookVO o1, BookVO o2) {
		
		int result = 0;
		
		if(o1.getCategory() < o2.getCategory()) {
			result = -1;
		} else if(o1.getCategory() > o2.getCategory()){
			result = 1;
		} else {
			result = 0;
		}
		
		return result;
	}
	
}
