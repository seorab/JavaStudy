package ch18;

import java.util.ArrayList;
import java.util.TreeSet;

public class HashSetExam {
	public static void main(String[] args) {
//		HashSet<Integer> lotto = new HashSet<Integer>();
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		
		for(int i = 0; i < 6; i++) {
			
		}
		
		
		
		
		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		String value2 = list.get(0);
		
	}
}









