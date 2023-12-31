package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		System.out.println(printer.sum(1));
		System.out.println(printer.sum(1,2));
		System.out.println(printer.sum(1,2,3));
		System.out.println(printer.sum(1,2,3,4));
		
		printer.println(10,true);
		printer.println(10,true,"둘리");
		
	}

	static class Printer {
//		public void println(String str) {
//			System.out.println(str);
//		}
//		public void println(int number) {
//			System.out.println(number);
//		}
//		public void println(boolean bool) {
//			System.out.println(bool);
//		}
//		public void println(double number) {
//			System.out.println(number);
//		}
		public <T> void println(T... ts) {
			for (T t : ts) {
				System.out.println(t);				
			}
		}
		public int sum(Integer...nums) {
			 int answer = 0;
			 for(Integer i:nums) {
				 answer += i;
			 }
			 return answer;
		}
	}
}

// Printer 클래스가 PrinterTest 클래스의 내부 클래스로 선언되어 있기 때문에 이러한 오류가 발생합니다.

// 내부 클래스의 인스턴스를 생성하기 위해서는 외부 클래스의 인스턴스가 필요합니다. 
//이를 해결하기 위해 Printer 클래스를 static으로 선언하면 됩니다. 
// static 내부 클래스는 외부 클래스의 인스턴스 없이도 인스턴스화 할 수 있습니다.