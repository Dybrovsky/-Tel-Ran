import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CalculatorAppl {

	public static void main(String[] args) throws IOException {
		File folder = new File("Folder");
		folder.mkdirs();
		File file = new File(folder, "MyCalcResult.txt");
		file.createNewFile();
		BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bwc = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bwf = new BufferedWriter(new FileWriter(file, true));

		while (true) {
			String[] ans = userQuest(brc, bwc);
			double op1;
			double op2;

			try {
				op1 = Double.parseDouble(ans[0]);
				op2 = Double.parseDouble(ans[1]);
			} catch (NumberFormatException e) {
				bwc.write("Error");
				bwc.newLine();
				bwc.flush();
				continue;
			}
			Double res = calc(op1, op2, ans[2]);
			if (res == null) {
				bwc.write("Wrong action. Enter +, - , *, /");
				bwc.newLine();
				bwc.flush();
				continue; // оператор (когда на него попадает то все что до него и до конца цикла будет пропущено
			}
			String str = op1 + ans[2] + op2 + " = " + res;

			bwf.write(str);
			bwf.newLine();

			bwc.write(str);
			bwc.newLine();
			bwc.write("Do you want to continue? (Y/N)");
			bwc.flush();
			String cont = brc.readLine();
			if (cont.equalsIgnoreCase("N"))
				break;
		}
		brc.close();
		bwc.close();
		bwf.close();

	}

	private static Double calc(double op1, double op2, String action) {
		switch (action) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		default:
			return null;

		}
	}

	private static String[] userQuest(BufferedReader brc, BufferedWriter bwc) throws IOException {
		String[] res = new String[3];
		bwc.write("Enter first number: \n");
		bwc.flush();
		res[0] = brc.readLine();
		bwc.write("Enter second number: \n");
		bwc.flush();
		res[1] = brc.readLine();
		bwc.write("Enter action: \n");
		bwc.flush();
		res[2] = brc.readLine();
		return res;
	}

}
