package registration;

import model.Course;
import model.Student;

import java.util.*;

public class RegisterNewStudent {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RegisterNewStudent rst = new RegisterNewStudent();
        Set<Student> students = new HashSet<>();

        for(int i = 1; i <= 5; i++){
            Student student = rst.registerStudent();
            students.add(student);
        }

        for (Student s: students) {
            System.out.println("\nCourse scorecard for "+ s.getFirstname() +" Student Number: "+ s.getStudentNo());
            s.setCourses(rst.getCourseScores());
        }

        for (Student s: students) {

        }
    }

    private Student registerStudent(){
        Student student = new Student();

        System.out.println("Welcome to Heights Innovations Technologies || Student Registration Portal");
        System.out.println("Kindly supply student information as requested");
        System.out.println("===========================================================================\n");

        System.out.print("Supply firstname: ");
        student.setFirstname(scanner.next());

        System.out.print("Supply lastname: ");
        student.setLastname(scanner.next());

        System.out.println("Your department is Software Engineering");
        student.setDepartment("Software Engineering");

        System.out.print("Supply level: ");
        student.setYear(scanner.next());

        String studentNo = generateStudentNo(student);
        System.out.println("Your student number is: "+ studentNo);
        student.setStudentNo(studentNo);

        return student;
    }

    private Set<Course> getCourseScores(){

        Set<Course> courses = new HashSet<>();

        Course course = new Course();


        course.setCourse_name("Java");
        System.out.print("Supply your score in Java");
        course.setScore(scanner.nextInt());
        courses.add(course);

        course.setCourse_name("Html");
        System.out.print("Supply your score in Html");
        course.setScore(scanner.nextInt());
        courses.add(course);

        course.setCourse_name("CSS");
        System.out.print("Supply your score in CSS");
        course.setScore(scanner.nextInt());
        courses.add(course);

        course.setCourse_name("JScript");
        System.out.print("Supply your score in JScript");
        course.setScore(scanner.nextInt());
        courses.add(course);

        return  courses;
    }

    private static String generateStudentNo(Student student){
        int number = 123;
        return (student.getFirstname().substring(0, 2) + student.getLastname().substring(0, 2) + number++).toUpperCase();
    }
}
