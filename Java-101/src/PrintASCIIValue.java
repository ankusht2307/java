
public class PrintASCIIValue {

	public static void main(String args[]) {

		// 7 bits -> each ascii value consists of 8 bits
		// 2^7 = 128 -> range of ascii (0-127)

		for (int i = 0; i <= 127; i++) {
			System.out.printf("%d : %c \n", i, i); // %d will print integer value and %c will print charachter value
		}
	}
}
