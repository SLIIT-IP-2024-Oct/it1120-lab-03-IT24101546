import java.util.Scanner;

public class IT24101546Lab3Q1A{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice (Rs.): ");
		double Pr_P1kg = input.nextDouble();

		System.out.println("Enter the number of kilograms you want to buy(kg): ");
		double amount = input.nextDouble();

		double tot_pay;

		tot_pay = Pr_P1kg*amount;

		System.out.println("The total amout is: "+tot_pay);
	}
}