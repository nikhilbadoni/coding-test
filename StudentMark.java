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
            System.out.println("Enter integer " + (i+1)+ " Value: ");
            sum += scanner.nextInt();
        }
        // printing total sum
        System.out.println("Total Sum is : " +  sum);
        scanner.close();
    }   
    
}

/*
OUTPUT :-
Enter integer 1 Value: 
12
Enter integer 2 Value: 
14
Enter integer 3 Value: 
12
Enter integer 4 Value: 
13
Enter integer 5 Value: 
14
Enter integer 6 Value: 
15
Enter integer 7 Value: 
15
Enter integer 8 Value: 
16
Enter integer 9 Value: 
17
Enter integer 10 Value: 
14
Total Sum is : 142
 */