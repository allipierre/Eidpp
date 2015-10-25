
public class Square {

	public static void main(String[] args) {
		double[] pow = new double[20];
		for (int i = 0; i < pow.length; i++) {
			pow[i] = Math.pow(2,  i);
			System.out.println("2^" + i + "\t=" + pow[i]);
		}

	}

}
