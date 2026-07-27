import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int numberOne, numberTwo;

        System.out.println("Input the first number to get a product: ");
        numberOne = sc.nextInt();

        System.out.println("Input the second number to get a product as well: ");
        numberTwo = sc.nextInt();

        System.out.println("The product of your sum is:  " + (numberOne * numberTwo));
    }    
}
