package exercises.exercise1;

public class Main {
    public static void main(String[] args){
        Student[] students=new Student[20];
        int[] quizScores=new int[10];
        int[] examScores=new int[2];
        for (int i=0; i< quizScores.length; i++){
            quizScores[i]=(int)(Math.random()*100);
        }
        for(int i=0; i<examScores.length; i++){
            examScores[i]=(int)(Math.random()*100);
        }

        // create the random data of student
        for(int i=0; i<students.length; i++){
            if (Math.random()>0.5){
                students[i]=new FullTime("Fulltime"+i, quizScores, examScores);
            }
            else{
                students[i]=new PartTime("Parttime"+i, quizScores);
            }
        }
        Session session=new Session(students);
        System.out.println("Average quiz score: "+ session.getAverageQuizScore());
        session.printQuizScoresInAscendingOrder();
    }
    
}
