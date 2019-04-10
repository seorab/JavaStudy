package ch12;

import java.util.Scanner;

public class Exam12_1_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;

		/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */
		/* ASCII_A 등 미리 정의되어 있는 아스키 코드 상수를 이용하여 */
		/* 대문자와 소문자 입력 여부 확인 */
		for(int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			if(ch >= ASCII_A && ch <= ASCII_Z) {
				isUpper = true; // 대문자
			} else if(ch >= ASCII_a && ch <= ASCII_z) {
				isLower = true; // 소문자
			}
		}
		/* 대문자와 소문자 입력 여부에 따라 결과 출력 */
		if(isUpper && isLower) {
			System.out.println("가입완료");
		} else {
			System.out.println("다시 입력해주세요.");
		}

		s.close();
	}
}





