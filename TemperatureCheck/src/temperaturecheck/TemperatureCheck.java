
package temperaturecheck;
import java.util.Scanner;
import javax.swing.*;
public class TemperatureCheck {
    
    public static void main(String[] args) {
        double userTemp; //Users temperature
        double userTemp2;// second use of temperature to store as separate
        String idNum;// number to determine if student of faculty/staff
        String keepGoing = "y"; //loop variable
        Scanner scanner = new Scanner(System.in);
        JFrame f; //shortened jframe 
        f = new JFrame();
        
        
        //start the loop with the keepgoing Variable
        while ("y".equals(keepGoing)){
            //get temp
            System.out.println("Please Enter Temperature: ");
            userTemp = scanner.nextDouble();

            //start branching with the temp using if else statements
            if (userTemp < 100.4){
                normalTemp(); //print out directions for normal temp
                keepGoing = JOptionPane.showInputDialog(f,
                        "Would you like to enter another guest? (y/n)");
            }
            else if (userTemp >= 100.4){
                
                highTemp1(); //print out directions for the first high temp

                JOptionPane.showMessageDialog(f,"Please retake temperature.");
                userTemp2 = scanner.nextDouble();

                if (userTemp2 < 100.4){
                    normalTemp2();
                


                }
                else if (userTemp2 >= 100.4){
                    highTemp2();


                    idNum = JOptionPane.showInputDialog(f,"Please Enter 1 "
                            + "if Student "
                            + "or Enter 2 if Faculty/Staff: ");

                    switch (idNum){
                        case "1":
                            remindGuest();

                            break;

                        case "2":
                            remindInstructor();
                            
                            break;

                        default:
                            errorMessage();           
                            break;  
                    }        
                }
                keepGoing = JOptionPane.showInputDialog(f,
                        "Would you like to enter another guest? (y/n)");
            }
            else{
                errorMessage();
                System.out.println("Please Enter Temperature: ");
                userTemp = scanner.nextDouble();
            }
        }
        goodDay(); //tell user to have a good day
    }
    public static void remindGuest(){  
        JFrame f; //shortened jframe 
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Remind guest to "
            + "contact instructors "
            + "to arrange makeup work. ");

    }
    public static void remindInstructor(){
        JFrame f; //shortened jframe 
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Remind guest "
            + "to contact their immediate "
            + "supervisor and the COVID coordinator");
    
    }
    public static void errorMessage(){
        JFrame f; //shortened jframe 
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Error: please "
            + "enter a valid input.");
        
    
    }
    public static void normalTemp(){
        JFrame f; //shortened jframe 
        f = new JFrame();    
        JOptionPane.showMessageDialog(f,"Give guest wrist band. "
            + "Wear this around campus for the rest of the "
            + "day at all "
            + "times. ");
        System.out.println();
        
    }
    public static void highTemp1(){
        JFrame f; //shortened jframe 
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Temperature is over 100.4. "
            + "Please have guest sit in designated "
            + "quarantine area.\n"
            + "Proceed to call Public Safety at (910)-678-8433.\n "
            + "In 5 minutes please retake temperature of guest.");

        System.out.println();        
    
    }
    public static void normalTemp2(){
        JFrame f; //shortened jframe 
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Give guest wrist band. "
            + "Tell them to wear the wrist band around campus "
            + "for the rest of the day at all times. "
            + "Sorry for the inconvenience.");         
        System.out.println();
        
    }
    public static void highTemp2(){
        JFrame f; //shortened jframe 
        f = new JFrame();        
        JOptionPane.showMessageDialog(f,"Let user know they should"
                + " leave campus "
                + "for everyones safety. "
                + "Instruct guest to monitor "
                + "symptoms and temperature. \n"
                + "Give guest COVID-19 Campus Exposure "
                + "Procedures Sheet. "
                + "Instruct guest to wait for Public "
                + "Safety Officer\n "
                + "Office will collect information and "
                + "escort guest "
                + "off campus. \n If guest has no ride, "
                + "they will be sat "
                + "in an isolation room. ");    
    }
    public static void goodDay(){
        JFrame f; //shortened jframe 
        f = new JFrame();        
        JOptionPane.showMessageDialog(f,"Have a Good Day!");      
    
    }
}
