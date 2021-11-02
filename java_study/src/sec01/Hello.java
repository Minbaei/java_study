package sec01; //package 문 특별히 필요하지 않다면 생략가능
/* 
 * 콘솔에 '안녕' 메시지를 출력하는 자바 프로그램
 */
public class Hello {
	public static void main(String[] args) {
	/*
	 * 메인 메소드 내부
	 */
		System.out.println("안녕!"); //화면에 문자 출력
		System.out.println("안녕" + "!"); //2개의 문자열을 합쳐서 출력
		
		String hello = "안녕!"; //문자열을 hello 변수에 대입한 후 hello 변수의 내용을 출력
		System.out.println(hello);
}
}