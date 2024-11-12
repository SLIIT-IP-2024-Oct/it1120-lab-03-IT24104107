import java.util.Scanner;
public  class IT24104107Lab3Q1B {
 public static void main (String [] args ) {
 double pricePerkg,quantity,discount,totalAmount,amountTopay ;
 Scanner lab = new Scanner(System.in);
  System.out.println ("Enter the  price of 1kg of rice:");
  pricePerkg=lab.nextDouble();
  System.out.println("Enter the number of kilograms you want to buy:");
  quantity=lab.nextDouble();
  totalAmount=pricePerkg*quantity;
  discount=totalAmount*0.1;
  amountTopay=totalAmount-discount;
  System.out.println("The total amount with 10% discount is:" +amountTopay);
 }
}