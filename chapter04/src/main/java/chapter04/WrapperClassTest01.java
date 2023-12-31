package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// 직접 생성하게 되면 JVM(Java virtual Machine)의 Heap상에 객체가 존재하게 된다.
		// 리터럴을 사용하게 되면 JVM 안의 Constant Pool이 관리한다.
//		Integer i = new Integer();
//		Character c = new Character('c');
//		Boolean b = new Boolean(false);

		// Auto Boxing
		Integer j1 = 10;
		Integer j2 = 10;

		System.out.println(j1 == j2); // 동일성 비교
		System.out.println(j1 < j2); // Auto Unboxing

		// Auto UnBoxing
//		int m = j1.intValue() + 10;
		int m = j1 + 10;
	}

}
