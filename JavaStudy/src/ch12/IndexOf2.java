package ch12;

class IndexOf2 {
	public static void main(String args[]) {
		//            0123456 789
		String str = "Java ������ �缺�� ���� ����������!!";
		int sidx = 0;
		int eidx = 0;
		
		while(true) {
			eidx = str.indexOf(" ", sidx + 1);
			if(eidx == -1) {
				break;
			}
			System.out.println(sidx + ", " + eidx);
			sidx = eidx;
		}
	}
}




