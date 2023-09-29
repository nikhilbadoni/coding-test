/*
 Write a Java switch case program to take the students names and marks of 10 students as input and display their grades according to the below conditions:
 * If marks above 90 then “A” grade
 * If marks between 90-80 then “B” grade
 * If marks between 80-70 then “C” grade
 * If marks between 70-60 then “D” grade
 * If marks between 45-60 then “E” grade 
 * Else “F”
 */
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] studentNames = new String[10];
        int[] studentMarks = new int[10];
        
        // Input student names and marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = input.next();
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            studentMarks[i] = input.nextInt();
        }
        
        // Display grades for each student using switch-case
        System.out.println("Grades for Students:");
        for (int i = 0; i < 10; i++) {
            String grade;
            int marks = studentMarks[i];
            
            switch (marks / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    if (marks >= 45) {
                        grade = "E";
                    } else {
                        grade = "F";
                    }
                    break;
            }
            
            System.out.println(studentNames[i] + ": " + grade);
        }
        input.close();
    }
}
/*
OUTPUT:-
 Enter the name of student 1: a
Enter the marks of student 1: 66
Enter the name of student 2: b
Enter the marks of student 2: 67
Enter the name of student 3: c
Enter the marks of student 3: 78
Enter the name of student 4: d
Enter the marks of student 4: 56
Enter the name of student 5: w
Enter the marks of student 5: 456
Enter the name of student 6: c
Enter the marks of student 6: 56
Enter the name of student 7: s
Enter the marks of student 7: 32
Enter the name of student 8: x
Enter the marks of student 8: 45
Enter the name of student 9: c
Enter the marks of student 9: 56
Enter the name of student 10: b
Enter the marks of student 10: 56
Grades for Students:
a: D
b: D
c: C
d: E
w: E
c: E
s: F
x: E
c: E
b: E
 */