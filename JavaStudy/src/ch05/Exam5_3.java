package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
//		int num1, num2;
//		for(int i = 1; i < 3; i++) {
//			num + "i"
//		}
		
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length; i++) {
			char temp = ' ';
			int random = (int)(Math.random() * 7);
			temp = nums[0];
			nums[0] = nums[random];
			nums[random] = temp;
		}

		System.out.println(nums);
	}
}


