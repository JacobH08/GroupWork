import java.util.Scanner;
 
 
public class StudentScores {
 
 public static void main(String[] args) {
  System.out.print("Enter the number of students:");
  Scanner input = new Scanner(System.in);
  int Students = input.nextInt();
  int[] score = new int[Students];
  int bestScore = 0;
 
  System.out.print("Enter " + Students + " scores:");
 //finds the best score
  for (int i = 0; i < score.length; i++) {
   score[i] = input.nextInt();
   if (bestScore < score[i]) {
    bestScore = score[i];
   }
  }
  //Creates a curve and adds it to their grades then finds out their letter grade
  double curve = (100 - bestScore );
    char grade;
  for (int i = 0; i < score.length; i++) {
   if (score[i] + curve >= 90)
    grade = 'A';
   else if (score[i] + curve >= 80)
    grade = 'B';
   else if (score[i]  + curve >= 70)
    grade = 'C';
   else if (score[i] + curve >= 60)
    grade = 'D';
   else
    grade = 'F';
    System.out.println("Student " + i +" score is " + score[i] +" and grade is " + grade);
  }
 
 
 }
 
}
