package Lotto;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public int[] data;

	public Lotto() {
		data = new int[6];
		setLotto();
		showLotto();
	}

	public void setLotto() {

		Random rnd = new Random();

		for (int i = 0; i < 6; i++) {
			data[i] = rnd.nextInt(44) + 1;
		}

		while (true) {

			int duplicateNumber = checkNumber();
			if (duplicateNumber < 7) {
				data[duplicateNumber] = rnd.nextInt(44) + 1;
				continue;
			}
			break;
		}
		Arrays.sort(data);
	}

	public int checkNumber() {

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j]) {
					return j;
				}
			}
		}
		return 10;
	}

	public int[] getLotto() {
		return data;
	}

	public void showLotto() {
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%2d ",data[i]);
		}
		System.out.println();
	}
}
