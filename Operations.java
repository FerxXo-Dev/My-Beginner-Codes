import java.util.Scanner;

public class Operations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int numberOne = sc.nextInt();

        System.out.println("Input the second one: ");
        int numberTwo = sc.nextInt();

        System.out.println("Sum: " + numberOne + " + " + numberTwo + " = " + (numberOne+numberTwo));
        System.out.println("Substract: " + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        System.out.println("multiply: " + numberOne + " * " + numberTwo + " = " + (numberOne *numberTwo));
        System.out.println("Divide: " + numberOne + " / " + numberTwo + " = " + (numberOne/numberTwo));
        System.out.println("Remainder: " + numberOne + " mod " + numberTwo + " = " + (numberOne%numberTwo));
        
    }

    
}
