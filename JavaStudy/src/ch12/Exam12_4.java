package ch12;

public class Exam12_4 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
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






