package Logging;


import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

public interface MainLogger {

    void log(Instructor instructor, Course course, Category category);

}
