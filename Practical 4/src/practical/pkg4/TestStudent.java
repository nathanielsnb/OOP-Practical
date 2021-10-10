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
public class TestStudent {
   public static void main(String[] args) {

    // Create a student object with given values for name and ID
            Student student = new Student ("14WAB11223", "Wee Wong");

	
    // Call to run the addQuiz methods several times (up to you) to get the totalScore and quizCount
    student.addQuiz(13);
    student.addQuiz(5);
	    

    // Display total score and average        
    System.out.println("Total score: " + student.getTotalScore());
    System.out.print("Average: " + student.getAverageScore());
   
    }
}
