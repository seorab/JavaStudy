package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int idx = 0;
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) {
				System.out.println(  str  );
				break;
			}
			System.out.println( str.substring(0, idx)  );
		}
	}
}