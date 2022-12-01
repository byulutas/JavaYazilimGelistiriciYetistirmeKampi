package Business;


import AccessDatabase.InstructorDao;
import Enitity.Instructor;

public class InstructorManager implements InstructorDao {

    @Override
    public void add(Instructor instructor) throws Exception {

        String firstName = instructor.getFirstName();
        String lastName = instructor.getLastName();

        if (!instructor.getFirstName().equalsIgnoreCase("Engin") && instructor.getLastName().equalsIgnoreCase("Demiroğ")) {
            throw new Exception(firstName + " " + lastName + " diye bir eğitmen bulunamadı. Başka eğitmen seçin");

        }
        else {
            System.out.println("Eğitmen seçildi: " + instructor.getFirstName().substring(0, 1).toUpperCase() + instructor.getFirstName().substring(1).toLowerCase()
                    + " " + instructor.getLastName().substring(0, 1).toUpperCase() + instructor.getLastName().substring(1).toLowerCase());
        }

    }

}
