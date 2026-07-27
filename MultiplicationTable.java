import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number to get the multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Mira tigre, puedo mover lo que yo quiera, jaja :D");
        for(int i = 1; i < 11; i++ ){
            System.out.println(number + " x " + i + " = " + (number * i));

        }

    }
    
}
