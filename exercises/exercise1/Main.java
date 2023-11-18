package exercises.exercise1;

public class Main{
    public static void main(String[] args){
        Session session=new Session();

        //create and add 20 students with dummy scores
        for (int i=1;i<=20;i++){
            if(i%2==0){
                FullTimeStudent fullTimeStudent=new FullTimeStudent("Full-Time Student" +i, i*10,i*5);
                fullTimeStudent.addQuizScore(i*2);
                fullTimeStudent.addQuizScore(i*3);
                session.addStudent(fullTimeStudent);

            } else{
                PartTimeStudent partTimeStudent=new PartTimeStudent("Part-Time Student "+i);
                partTimeStudent.addQuizScore(i*4);
                partTimeStudent.addQuizScore(i*2);
                session.addStudent(partTimeStudent);
            }
        }
        //output
        session.printAverageQuizScores();
        System.out.println();
        session.printQuizScoresAscendingOrder();
        System.out.println();
        session.printPartTimeStudents();
        System.out.println();
        session.printFullTimeStudentExams();
    }
}