package exercises.exercise1;

public class Student {
    String name;
    int[] quizScores;

public Student(String name, int[] quizScores){
   this.name=name;
   this.quizScores=quizScores;
 }
 public String getName(){
    return name;
 }
 public int[] getQuizScores(){
    return quizScores;
 }
}

class FullTime extends Student{
    int[] examScores=new int[2];

    public FullTime(String name, int[] quizScores, int[] examScores){
        super(name, quizScores);
        this.examScores=examScores;
    }

    public int[] getExamScores(){
        return examScores;
    }
}

class PartTime extends Student{

    public PartTime(String name, int[] quizScores) {
        super(name, quizScores);
       
    }
    
}
