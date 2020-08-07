
public class LabeledBreak {

	public static void main(String args[]) {

		ankush: // label
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (i == 3)
					break ankush;
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
