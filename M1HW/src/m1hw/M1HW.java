
package m1hw;
import java.util.Scanner;
public class M1HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOne; //first math num
        int numTwo; //second math num
        int total; //var used to get the final math conclusion
        int choice; //user choice
        
        System.out.println("Welcome to the calculator program!");
        
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Exit");
        System.out.print("Enter your Choice: ");
        choice = scanner.nextInt();
        
        while (choice != 5){
            
            if (choice == 1){
                System.out.println("Add");
                
                System.out.print("Enter first number: ");
                numOne = scanner.nextInt();
                System.out.print("Enter second number: ");
                numTwo = scanner.nextInt();
                
                total = numOne + numTwo;
                
                System.out.println("The total is " + total);
                
                System.out.println("Enter a new choice: ");
                choice = scanner.nextInt();
                
                
            }
            else if (choice == 2){
                System.out.println("Subtract");
                System.out.print("Enter first number: ");
                numOne = scanner.nextInt();
                System.out.print("Enter second number: ");
                numTwo = scanner.nextInt();
                
                total = numOne - numTwo;
                
                System.out.println("The total is " + total);                
                System.out.println("Enter a new choice: ");
                choice = scanner.nextInt();                
            }
            else if (choice == 3){
                System.out.println("Multiply");
                System.out.print("Enter first number: ");
                numOne = scanner.nextInt();
                System.out.print("Enter second number: ");
                numTwo = scanner.nextInt();
                
                total = numOne * numTwo;
                
                System.out.println("The total is " + total);                
            
                System.out.println("Enter a new choice: ");
                choice = scanner.nextInt();                
            }            
            else if (choice == 4){
                System.out.println("Divide");
                System.out.print("Enter first number: ");
                numOne = scanner.nextInt();
                System.out.print("Enter second number: ");
                numTwo = scanner.nextInt();
                
                total = (numOne / numTwo);
                
                System.out.println("The total is " + total);                
            
                System.out.println("Enter a new choice: ");
                choice = scanner.nextInt();                
            }
                
                  
            else {                

                System.out.println("Wrong choice!, Enter a correct choice: ");
                choice = scanner.nextInt();
                           
            }
            
        }
        System.out.println("Goodbye!");
        
    }
    
}
