package practical.pkg4;

public class Student {
    
    	private String ID;
	private String name;
        private double totalScore;
        private int quizCount;
        private static double quizContribution;

	
	// Create a no-arg constructor
	
        public Student(){
            this("20WAD22 345", "Mike");
        }

	// Create a constructor with 2 parameters ID and name
	public Student(String d, String n) {
	    this.ID = d;
	    this.name = n;
            this.totalScore = 0;
            this.quizCount = 0;
	} 
        
        public static double getQuizContribution() {
            return Student.quizContribution;
        }
        
        public static void setQuizContribution(double quizContribution) {
            Student.quizContribution = quizContribution;
        }

        public String getID() {
	    return this.ID;
	}
        
        public String getName(){
            return this.name;
        }

	public void setID(String d) {
            this.ID = d;
	}
	
        public void setName(String n) {
            this.name = n;
        }

	public void addQuiz(int score) {
            this.totalScore = this.totalScore + score;
            this.quizCount = this.quizCount + 1;
	}
        
        public double getTotalScore() {
            return this.totalScore;
        }

	public double getAverageScore() {
	    return this.totalScore / this.quizCount;
	}
}
