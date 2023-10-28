package exercises.exercise1;

import java.util.Arrays;

public class Session {
    Student[] students=new Student[20];

    public Session(Student[] students){
        this.students=students;
    }


// calculate average quiz scores each sudent
public double getAverageQuizScore(){
    double sum=0;
    for (Student student:students){
        for (int i=0; i<student.getQuizScores().length; i++){
            sum += student.getQuizScores()[i];
        }
    }
    return sum / students.length;
 }
 // print the quiz scores each student
 public void printQuizScoresInAscendingOrder(){
    for (Student student:students){
        int[] quizScores=student.getQuizScores();
        Arrays.sort(quizScores);
        for (int i=0; i<quizScores.length; i++){
            System.out.print(quizScores[i] +" ");
        }
        System.out.println();
    }
 }
}
