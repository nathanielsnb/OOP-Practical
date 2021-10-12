package practical.pkg4;

public class CourseDriver {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Computers", 250);
        System.out.format("Course Title     : %s\n", course.getCourseTitle());
        System.out.format("Fees per student : RM %.2f\n", course.getFeesPerStudent());
    }
}