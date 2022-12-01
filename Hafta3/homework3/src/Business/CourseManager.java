package Business;

import AccessDatabase.CourseDao;
import Enitity.Course;

import java.util.ArrayList;
import java.util.List;


public class CourseManager implements CourseDao {

    @Override
    public void add(Course course) throws Exception {

        if (course.getCoursePrice() < 0) {
            throw new Exception("Fiyat sıfırdan küçük olamaz.");
        }

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("Java + React");
        list.add(".Net");
        list.add("Programlamaya Giriş");

        boolean containsSearchStr = list.stream().anyMatch(course.getCourseName()::equalsIgnoreCase);
        if (!containsSearchStr) {
            throw new Exception("Böyle bir kurs yok. Başka kurs seçin");
        } else {
            System.out.println("Kurs Seçildi: " + course.getCourseName().substring(0, 1).toUpperCase() + course.getCourseName().substring(1).toLowerCase());
        }

    }

}



