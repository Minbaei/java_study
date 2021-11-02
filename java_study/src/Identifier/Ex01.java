package Identifier;

public class Ex01 {
	/*
	 * 식별자 프로그램에서 사용하는 변수, 메서드, 클래스, 상수 등도 이름으로 구별하는데,
	 * 이것을 식별자 라고 한다. 식별자를 작성할 때는 다음 규칙을 따라야함
	 * 문자, 언더바, $로 사작해야함 한글도가능 영문자는 대.소문자를 구분
	 * +,- 등 연산자를 포함하면 안됨
	 * 자바 키워드를 사용하면 안됨
	 * 길이에 제한이 없다.
	 * 
	 * 데이터 타입 byte, char, short, int, long, float, double, boolean
	 * 접근지정자  private, protected, public
	 * 제어문  if, else, for, while, do, break, continue, switch, case
	 * 클래스와 객체 class, interface, enum, extends, implements, new, this, super, instanceof, null
	 * 예외처리  try, catch, finally, throw, throws
	 * 기타  abstract, assert, const, default, false, final, import, native, package, return, static, strictfp, synchronized, transient, true, void, volatile
	 */
	
	//변수와 메서드는 모두 소문자로 표기한다. 단, 복합 단어일 때는 두번째 단어부터 단어의 첫 자만 대문자로 표기한다.
	int thisYear;
	String currentPosition;
	boolean isEmpth;
	public int getYear( ) { //리턴이 있어야 에러가 안남
		return thisYear; }
	
	//클래스와 인터페이스는 첫 자만 대문자로 표기하고 나머지는 소문자로 표기한다. 단, 복합 단어일때는 각 단어의 첫자만 대문자로 표기함
	public class HelloDemo { }
	public interface MyRunnable { }
	
	//상수는 전체를 대문자로 표기한다. 단, 복함 단어일 때는 단어를 언더바로 연결한다.
	final int NUMBER_ONE = 1;
	final double PI = 3.141592;
	
	

}
