package ch18;

import java.util.Iterator;
import java.util.TreeSet;

public class Exam18_3 {
	public static void main(String[] args) {
		// 로또 번호를 담을 set 객체 생성
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		// 번호 3개 미리 선택(저장)
		lotto.add(2);
		lotto.add(7);
		lotto.add(11);

		// 미리 선택한 번호를 제외하고 나머지 랜덤 생성 후 저장
		while(true) {
			if(lotto.size() == 6) break;
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
		}

		// 선택(저장)된 로또 번호 확인(출력)
		Iterator<Integer> iter = lotto.iterator();
		String seperator = "";
		while (iter.hasNext()) {
			System.out.print(seperator + iter.next());
			seperator = ", ";
		}
	}
}