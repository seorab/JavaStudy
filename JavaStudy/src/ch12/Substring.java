package ch12;

public class Substring {
	public static void main(String args[]) {
		//                4    8   12
		String str = "Java ������ �缺�� ���� ����������!!";
		
		int idx = 0;
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) {
				System.out.println(str);
				break;
			}
			System.out.println( str.substring(0, idx)  );
		}
		
		
		
	}
}




