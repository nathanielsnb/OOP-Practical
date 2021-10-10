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
public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Computers", 250);
        System.out.format("Course Title     : %s\n", course.getCourseTitle());
        System.out.format("Fees per student : RM %.2f\n", course.getFeesPerStudent());
    }
}