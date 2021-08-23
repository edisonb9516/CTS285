/*
 * This program...
* Brandon Edison
* Instructor Teter
*
*/
package arraysevendwarfs;
import java.util.ArrayList;
public class ArraySevenDwarfs {
    
    public static void main(String[] args){
           
        // Create an ArrayList to hold the names of "The Seven Dwarfs".
        ArrayList<String> sevenDwarfs = new ArrayList<String>();
        
        
        // Add the names of "The Seven Dwarfs" to the ArrayList. nameList.add("Happy")
        sevenDwarfs.add("Happy");
        sevenDwarfs.add("Grumpy");
        sevenDwarfs.add("Sneezy");
        sevenDwarfs.add("Bashful");
        sevenDwarfs.add("Dopey");
        sevenDwarfs.add("Doc");
        sevenDwarfs.add("Sleepy");
        // Display the size of the ArrayList.
        
        System.out.print("The number of Dwarfs is ");
        System.out.println(sevenDwarfs.size());
        
        
        // Now display the items in nameList. --- Use a FOR LOOP ---
        
        for (int i = 0; i < sevenDwarfs.size(); i++){
            System.out.println(sevenDwarfs.get(i));
            
        }
    }
   
    public static void ArraySevenDwarfs() {
         
    }

}