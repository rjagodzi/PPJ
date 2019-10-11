package ppj.git;

public class Cwiczenie3 {

	public static void kreatorPiramidy(int parametr) {
		for (int i = 0; i <= parametr; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + ", ");
			}

			System.out.println();

		}

	}

	public static void main(String[] args) {

		kreatorPiramidy(10);

	}

}
