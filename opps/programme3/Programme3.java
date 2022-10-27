package oops.programme3;

import java.util.Scanner;

public class Programme3 {
	Branch branch;
	Customer customer;
	Customer_Account_Statement custAccStatement;

	public Programme3() {
		// TODO Auto-generated constructor stub
		System.out.println(" - Welcome- ");
		System.out.println("******************************");
		System.out.println(" - Please choose an service -");
		System.out.println("----------------------------- ");
	}

	protected static void createCustomers() {

	}

	public static void main(String[] args) {
		// Just calling for Greetings!
		Programme3 p3 = new Programme3();
		// Firstly Create multiple Customer
		// PARENT
		Customer[] cusArray = new Customer[5];
		cusArray[0] = new Customer("000101", "101", "rahul", "Indore", "25/08/1990", "01/09/2022",
				new Branch("BRH50", "bhavar kua", "bhavar kua square"));
		cusArray[1] = new Customer("000102", "102", "karan", "Indore", "5/05/1989", "01/09/2022",
				new Branch("BRH50", "bhavar kua", "bhavar kua square"));
		cusArray[2] = new Customer("000103", "103", "trisha", "Indore", "15/12/1999", "01/09/2022",
				new Branch("BRH50", "bhavar kua", "bhavar kua square"));
		cusArray[3] = new Customer("000104", "104", "Roshni", "Indore", "30/01/1995", "01/09/2022",
				new Branch("BRH50", "bhavar kua", "bhavar kua square"));
		cusArray[4] = new Customer("000105", "104", "romit", "Indore", "7/06/1988", "01/09/2022",
				new Branch("BRH50", "bhavar kua", "bhavar kua square"));
		// Firstly Create multiple Customer Account Statement
		// CHILD

		Customer_Account_Statement[] casArray = new Customer_Account_Statement[17];
		casArray[0] = new Customer_Account_Statement("CAI101", "CUST101", 0, 0, 0, null);
		casArray[1] = new Customer_Account_Statement("CAI101", "CUST101", 1000, 1000, 0, "01/09/2022");
		casArray[2] = new Customer_Account_Statement("CAI101", "CUST101", 800, 0, 200, null);
		casArray[3] = new Customer_Account_Statement("CAI101", "CUST101", 700, 0, 100, null);
		casArray[4] = new Customer_Account_Statement("CAI101", "CUST101", 500, 0, 200, null);
		casArray[5] = new Customer_Account_Statement("CAI102", "CUST102", 0, 0, 0, null);
		casArray[6] = new Customer_Account_Statement("CAI102", "CUST102", 800, 800, 0, "05/09/2022");
		casArray[7] = new Customer_Account_Statement("CAI102", "CUST102", 700, 0, 100, null);
		casArray[8] = new Customer_Account_Statement("CAI103", "CUST103", 0, 0, 0, null);
		casArray[9] = new Customer_Account_Statement("CAI103", "CUST103", 500, 500, 0, "02/09/2022");
		casArray[10] = new Customer_Account_Statement("CAI103", "CUST103", 100, 0, 400, null);
		casArray[11] = new Customer_Account_Statement("CAI103", "CUST103", 500, 400, 0, "05/09/2022");
		casArray[12] = new Customer_Account_Statement("CAI104", "CUST104", 0, 0, 0, null);
		casArray[13] = new Customer_Account_Statement("CAI104", "CUST104", 2000, 2000, 0, "1/09/2022");
		casArray[14] = new Customer_Account_Statement("CAI104", "CUST104", 2700, 700, 0, "10/09/2022");
		casArray[15] = new Customer_Account_Statement("CAI105", "CUST105", 0, 0, 0, null);
		casArray[16] = new Customer_Account_Statement("CAI105", "CUST105", 100, 100, 0, "1/09/2022");

		/*
		 * Operation perform taking Input by the user
		 */
		System.out.println("Please enter customer Id -> ");

		Scanner scan = new Scanner(System.in);
		String input1 = scan.next(); // reads line.

		for (int i = 0; i < cusArray.length; i++) {
			if (cusArray[i].getCust_id().equals(input1)) {
				System.out.println(cusArray[i].toString());
			}
		}

		// iterating value from CAS Array
		for (int j = 0; j < casArray.length; j++) {

			if (casArray[j].getCustId().equals(input1)) {
				System.out.println(casArray[j].toString());
			}
		}

	}

}