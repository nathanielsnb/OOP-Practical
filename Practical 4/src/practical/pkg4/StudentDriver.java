package practical.pkg4;

public class StudentDriver {
    public static void main(String[]args){
        Student stu01 = new Student("232634", "Ali");
        stu01.addQuiz(12);
        stu01.addQuiz(5);
        stu01.addQuiz(5);
        stu01.addQuiz(6);
        stu01.addQuiz(8);
        System.out.println("Total Score : " + stu01.getTotalScore() + " for " + stu01.getName());
        System.out.println("Total Average Score : " + stu01.getAverageScore() + " for " +
        stu01.getName());
    }
}

