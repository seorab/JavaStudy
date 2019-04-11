package ch12;

public class Exam12_4 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int sidx = -1;
		int eidx = 0;
		
		while(true) {
			eidx = str.indexOf(" ", sidx + 1);
			if(eidx == -1) {
				System.out.println(  str  );
				break;
			}
			System.out.println( str.substring(sidx+1, eidx)  );
			sidx = eidx;
		}
	}
}






