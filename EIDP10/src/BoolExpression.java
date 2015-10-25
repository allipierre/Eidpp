
public class BoolExpression {

	public static void main(String[] args) {
		boolean wert1 = false;
		boolean wert2 = true;
		boolean Erg = !wert1 & (wert1 | wert2);
		System.out.println(Erg);

		wert1 = true;
		wert2 = true;
		Erg = !wert1 & (wert1 | wert2);
		System.out.println(Erg);

	}

}
