import java.util.Scanner;
 public class IT24104107Lab3Q4 {
  public static void main (String [] args) {
   int number,digit1,digit2,digit3,digit4,digit5 ;
   Scanner lab = new Scanner(System.in);
    System.out.println ("Enter the five digits ");
    number = lab.nextInt();
    digit1=(number/10000)%10;
    digit2=(number/1000)%10;
    digit3=(number/100)%10;
    digit4=(number/10)%10;
    digit5=(number/1)%10;
    System.out.println(digit1+" " + digit2+" " + digit3+" "+digit4+" "+digit5+" ");
  }
 }
   
  