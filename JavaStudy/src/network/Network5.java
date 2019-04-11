package network;

import com.ggoreb.kakao_api.TranslateUtil;
import com.ggoreb.kakao_api.VisionUtil;

public class Network5 {
	public static void main(String[] args) {
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String r = tu.sendText("kr", "jp", "안녕하세요. 저는 개발자 입니다.");
		System.out.println(r);
		
//		VisionUtil vu = new VisionUtil("0a7c5408897da72ef62213f279237f86");
//		String result = vu.sendFile("c:/dev/a.jpg");
//		System.out.println(result);
//		
//		String r = vu.sendUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQ6MgGYHrx_dbYvlDQ11JG9krQNHLFZteNmi_F1w51HFaiX5trGw");
//		System.out.println(r);
	}
}
