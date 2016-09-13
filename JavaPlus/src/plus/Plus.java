package plus;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");

		int first = key.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");

		int second = key.nextInt();
		System.out.println(first+second);
	
	}

}
