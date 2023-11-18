package exercises.exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Session {
    private List<Student> students;

    public Session(){
        students=new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void printAverageQuizScores(){
        System.out.println("Average Quiz Scores for All Students: ");
        for (Student student:students){
            System.out.println("Name: "+student.getName()+", Average Quiz Score: "+student.calculateAverageQuizScore());
        }
    }
    public void printQuizScoresAscendingOrder(){
        System.out.println("Quiz Scores(Ascending) for All Students: ");
        for(Student student:students){
           List<Integer> scores=new ArrayList<>(student.getQuizScores());
           Collections.sort(scores);
           System.out.println("Name: "+student.getName()+", Quiz Scores: " + scores);

        }
    }
    public void printPartTimeStudents(){
        System.out.println("Part-Time Students: ");
        for (Student student: students){
            if(student instanceof PartTimeStudent){
                System.out.println(student.getName());
            }
        }
    }
    public void printFullTimeStudentExams(){
        System.out.println("Full-Time Student Exam Scores:");
        for(Student student: students){
            if(student instanceof FullTimeStudent){
                FullTimeStudent fullTimeStudent=(FullTimeStudent) student;
                System.out.println("Name: "+fullTimeStudent.getName()+", Exam Score 1: "+fullTimeStudent.getExamScore1()+", Exam Score 2: "+fullTimeStudent.getExamScore2());
            }
        }
    }

    
}
