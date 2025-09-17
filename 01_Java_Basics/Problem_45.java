import java.util.Scanner;

public class Problem_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int num1=0;
        int num2=1;
        

        for (int i = num1; i <= num; i++) {
           int  fib = num1+num2;
            System.out.println(fib);
            num1++;
            num2++
           
        }
        
    }
}

