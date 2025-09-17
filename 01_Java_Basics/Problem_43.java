import java.util.Scanner;

public class Problem_43 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("enter a number for pattern: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "*i);
            }
           
        }
        
        
        sc.close();
    }
}
