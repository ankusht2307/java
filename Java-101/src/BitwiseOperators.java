
public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// & 1 1 -> 1
		// | 1 0 -> 1
		// | 0 0 -> 0
		// | 0 1 -> 1

		int a = 25; // 1 1 0 0 1
		int b = 15; // 0 1 1 1 1

		int c = a & b;

		System.out.println(c);

		int d = a | b;
		
		System.out.println(d);

	}

}
