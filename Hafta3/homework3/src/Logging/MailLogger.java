package Logging;

import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

import java.text.MessageFormat;

public class MailLogger implements MainLogger {

    @Override
    public void log(Instructor instructor, Course course, Category category) {
        String firstName = "Eğtimen Adı: " + instructor.getFirstName();
        String lastName = "Eğtimen Soyadı:" + instructor.getLastName();
        String courseName = "Kurs Adı: " + course.getCourseName();
        String categoryName = "Kategori: " + category.getCategoryName();
        String coursePrice = "Kurs Ücreti: " + course.getCoursePrice();

        String string = MessageFormat.format("\nE-Postaya Loglanıyor...\n{0}\n{1}\n{2}\n{3}\n{4} ", firstName, lastName, courseName, categoryName, coursePrice);
        System.out.println(string);


    }
}
