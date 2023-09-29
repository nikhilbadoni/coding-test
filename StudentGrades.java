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
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[]studentNames = new String[10];
        int[]studentMarks = new int[10];

        // input student name and marks
        for(int i=0; i<10; i++){
            System.out.println("Enter name of Student" + (i+1)+ ":");
            studentNames[i] = input.next();
                        System.out.println("Enter marks of Student" + (i+1)+ ":");
            studentMarks[i] = input.nextInt();

        }
        // Display grades for each student
        System.out.println("Grades for Students:");
        for (int i = 0; i < 10; i++) {
            String grade;
            if (studentMarks[i] > 90) {
                grade = "A";
            } else if (studentMarks[i] >= 80) {
                grade = "B";
            } else if (studentMarks[i] >= 70) {
                grade = "C";
            } else if (studentMarks[i] >= 60) {
                grade = "D";
            } else if (studentMarks[i] >= 45) {
                grade = "E";
            } else {
                grade = "F";
            }
            
            System.out.println(studentNames[i] + ": " + grade);
        }
        input.close();
    }
    
}

/*
OUTPUT:- 
 Enter name of Student1:
Nik
Enter marks of Student1:
90
Enter name of Student2:
Raj
Enter marks of Student2:
88
Enter name of Student3:
Viv
Enter marks of Student3:
87
Enter name of Student4:
Akhi
Enter marks of Student4:
89
Enter name of Student5:
Div
Enter marks of Student5:
78
Enter name of Student6:
Sha
Enter marks of Student6:
89
Enter name of Student7:
ram
Enter marks of Student7:
67
Enter name of Student8:
Kum
Enter marks of Student8:
67
Enter name of Student9:
guj
Enter marks of Student9:
45
Enter name of Student10:
esha
Enter marks of Student10:
45
Grades for Students:
Nik: B
Raj: B
Viv: B
Akhi: B
Div: C
Sha: B
ram: D
Kum: D
guj: E
esha: E
 */