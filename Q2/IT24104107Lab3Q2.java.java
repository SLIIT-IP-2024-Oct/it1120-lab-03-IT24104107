import java.util.Scanner;
public class IT24104107Lab3Q2 {
  public static void main (String [] args) {
   double monthlysalary,othours,othoursrate,otamount,totalsalary;
   Scanner lab = new Scanner(System.in);
   System.out.println("Enter the monthly salary");
   monthlysalary=lab.nextDouble();
    System.out.println("Enter the number of OT hours");
    othours=lab.nextDouble();
    System.out.println("Enter the hourly rate");
    othoursrate=lab.nextDouble();
    otamount=othours*othoursrate;
    totalsalary=monthlysalary+otamount;
    System.out.println("The total salary including OT is: " + totalsalary);
  }
}