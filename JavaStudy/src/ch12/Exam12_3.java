package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
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