package Scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d 입니다\n", x, y, x * y);
		
		/*
		 * 키보드로 데이터를 입력 받을 때 System.in 객체를 사용해 입력 스트림을 생성
		 * 입력된 데이터를 처리하는 과정이 번거로움
		 * 다음 방식으로 Scanner 클래스와 연결하면 데이터를 쉽게 입력받아 처리 가능
		 * 컴파일(임포트)  > 스캐너 객체 생성 > 키보드로 데이터 입력 받음
		 * 기본적으로 next()  String 변환 타입
		 */
	}

}