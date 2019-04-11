package ch12;

public class Lotto {
	public static void main(String[] args) {
		NetworkUtil u = new NetworkUtil();
		String data = 
			u.get("https://dhlottery.co.kr/gameResult.do?method=byWin");
		//System.out.println(data);
		int sidx = data.indexOf("num win");
		int eidx = data.indexOf("</p>", sidx);
		String lotto = data.substring(sidx, eidx);
//		System.out.println(lotto);
		
		int pidx = lotto.indexOf("<p>");
		lotto = lotto.substring(pidx);
		sidx = 0; // 위에서 찾은 위치 초기화
		while(true) {
			sidx = lotto.indexOf("\">", sidx + 1);
			eidx = lotto.indexOf("<", sidx);
			if(eidx == -1) break;
			String num = lotto.substring(sidx+2, eidx);
			System.out.println(num);
			sidx = eidx;
		}
	}
}







