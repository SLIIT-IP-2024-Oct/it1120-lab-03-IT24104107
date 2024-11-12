import java.util.Scanner;
public class IT24104107Lab3Q1A {
 public static void main (String [] args) {
  double priceperkg,noofkg,totalamount;
  Scanner lab= new Scanner (System.in);
  System.out.println("Enter the price of 1kg of rice");
  priceperkg = lab.nextDouble();
  System.out.println("Enter the number of kilograms you want to buy");
  noofkg = lab.nextDouble();
  totalamount = priceperkg*noofkg;
  System.out.println("Total amount :"+totalamount);
 }
}