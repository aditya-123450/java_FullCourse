import java.util.Scanner;

public class for_loop{
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner s = new Scanner(System.in); 
        int num = s.nextInt(); 

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i); 
        }
    }
}
