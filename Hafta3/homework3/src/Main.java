import AccessDatabase.HibernateDao;
import AccessDatabase.JdbcDao;
import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;
import Logging.DatabaseLogger;
import Logging.FileLogger;
import Logging.MailLogger;

public class Main {

    public static void main(String[] args) throws Exception {

        Instructor instructor = new Instructor("Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);

        Category category = new Category("Programlama");
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category);

        Course course = new Course("java + React", 20);
        CourseManager courseManager = new CourseManager();
        courseManager.add(course);

        FileLogger fileLogger = new FileLogger();
        fileLogger.log(instructor, course, category);

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log(instructor, course, category);

        MailLogger mailLogger = new MailLogger();
        mailLogger.log(instructor, course, category);

        HibernateDao hibernateDao = new HibernateDao();
        hibernateDao.add(category);
        hibernateDao.add(course);
        hibernateDao.add(instructor);

        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.add(category);
        jdbcDao.add(course);
        jdbcDao.add(instructor);

    }
}