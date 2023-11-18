package exercises.exercise1;
import java.util.ArrayList;
import java.util.List;

public class Student{
    protected String name;
    protected List<Integer> quizScores;

    public Student(String name){
        this.name=name;
        this.quizScores=new ArrayList<>();
    }
    public void addQuizScore(int score){
        quizScores.add(score);
    }
    public double calculateAverageQuizScore(){
        if (quizScores.isEmpty()){
            return 0;
        }
        int total=quizScores.stream().mapToInt(Integer::intValue).sum();
        return (double) total / quizScores.size();
    }
    public String getName(){
        return name;
    }
    public List<Integer> getQuizScores(){
        return quizScores;
    }
}