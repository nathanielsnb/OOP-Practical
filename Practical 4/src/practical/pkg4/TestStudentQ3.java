/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg4;

/**
 *
 * @author Nathaniel
 */
public class TestStudentQ3 {
    public static void main(String [] args) {
        Student student = new Student ("14WAB11223", "Wee Wong");
        Student student2 = new Student();
        
        System.out.print("ID for student 2: ");
        System.out.println(student2.getID());
        System.out.print("Name for student2: ");
        System.out.println(student2.getName());
        
        //To set 20% for contribution of quiz
        Student.setQuizContribution(20);
        
	// Call to run the addQuiz methods several times (up to you) to get the totalScore and quizCount
	student.addQuiz(8);
	student.addQuiz(7);
        student.addQuiz(9);
	   
	// Display total score and average
	System.out.print("Name: ");
        System.out.println(student.getName());
         
        System.out.print("Total score: ");
        System.out.println(student.getTotalScore());
        
        System.out.print("Average: ");
        System.out.println(student.getAverageScore());
        
        //calculate and display marks fromquiz
        System.out.println("Total marks from quiz is ");
        System.out.println(student.getAverageScore()*Student.getQuizContribution()/100);

    }     
}
    

