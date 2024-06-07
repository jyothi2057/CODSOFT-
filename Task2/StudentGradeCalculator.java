import java.util.Scanner;
public class StudentGradeCalculator
{
       public static void main(String args[])
       { 
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no.of subjects: "); 
         int numberOfSubjects=sc.nextInt();
         int totalMarks = 0;
         for (int i = 0;i< numberOfSubjects;i++)
         { 
             System.out.println("Enter marks for subject " + (i + 1) + ": ");
             int marks = sc.nextInt();               
             totalMarks += marks;
         }
        double averagePercentage=(double)(totalMarks/numberOfSubjects);
    char grade = 'F';
    if (averagePercentage >= 90) {
      grade = 'A';
      System.out.println("Status: PASSED!!");
    } else if (averagePercentage >= 80) {
      grade = 'B';
      System.out.println("Status: PASSED!!");
    } else if (averagePercentage >= 70) {
      grade = 'C';
      System.out.println("Status: PASSED!!");
    } else if (averagePercentage >=60){
        grade='D';
        System.out.println("Status: PASSED!!");
    }
    else{
    sc.close();
    System.out.println("Status: FAILED!!");
        
    }
    System.out.println("The total marks of all subjects: "+totalMarks+"/"+(numberOfSubjects*100));
    System.out.println("The average percentage of subjects: "+averagePercentage);
    System.out.println("Grade of the student: "+grade);
           
       }
    
}
