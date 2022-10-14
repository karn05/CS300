package CS300_19_09;

import java.util.*;
public class OSWorkbook {
	
	public static int pager(int []array, int chapter, int perPage) {
		int amount = 0;
		int page = 0;
		for(int c = 0; c < chapter; c++) {
			int quest = 0;
			page = page+1;
			for(int p = 0; p < perPage; p++) {
				for(int k = 0; k < array[c]; k++) {
					quest = quest +1;
					if(quest == page) {
						amount++;
					}
				}
			}
		}
		return amount;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int chapter = sc.nextInt(); //chapter amount
		int QPerPage = sc.nextInt(); //question per page
		int[] array = new int[chapter]; //question per chapter
		
		for(int i = 0; i < chapter; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(pager(array, chapter, QPerPage));
	}
}
