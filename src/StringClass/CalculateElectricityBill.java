package StringClass;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input_1 = sc.nextLine();
		String input_2 = sc.nextLine();
		int units = sc.nextInt();
		int Ebill = CalculateElectricityBill.calculateElectricityBill(input_1,input_2,units);
		System.out.println(  Ebill);
	}
static int calculateElectricityBill(String input_1, String input_2, int units) {
		int Total_Units=Integer.parseInt(input_1.substring(5))-Integer.parseInt(input_2.substring(5));
		int Total_price=Total_Units*units;
		return Total_price;
	}

}
