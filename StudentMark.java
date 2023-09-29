/*
WAP to find sum of 10 integers and print the sum with a proper SOP statement.
using for loop
 */
import java.util.Scanner;
public class StudentMark {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i =0; i < 10; i++){
            // taking input here
            sum += scanner.nextInt();
        }
        // printing total sum
        System.out.println("Total Sum is : " +  sum);
        scanner.close();
    }   
    
}
