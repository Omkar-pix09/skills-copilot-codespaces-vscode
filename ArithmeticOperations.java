import java.util.Scanner;

public class ArithmeticOperations { 
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.println("Enter a:");
        int a = sc.nextInt();
        
     
        System.out.println("Enter b:");
        int b = sc.nextInt();
        
        
        int sum = a + b;   
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
       
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulo: " + mod);
        
        
        sc.close();
    }
}
/*Enter a:
5
Enter b:
9
Sum: 14
Difference: -4
Multiplication: 45
Division: 0
Modulo: 5*/
