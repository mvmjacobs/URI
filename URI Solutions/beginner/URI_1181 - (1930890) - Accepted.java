import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0");
		
		double m[][] = new double[12][12];		
		int n = Integer.parseInt(input.readLine());
		String str = input.readLine();
		
		double result = 0.0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Double.parseDouble(input.readLine());
				if (i == n) {
					result += m[i][j];
				}
			}
		}
		System.out.println(str.equalsIgnoreCase("S") ? df.format(result).replaceAll(",", ".") : df.format(result / m[n].length).replaceAll(",", "."));
		
    }
}