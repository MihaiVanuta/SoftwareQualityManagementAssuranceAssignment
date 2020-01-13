import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void checkSetNume(){
        String nume = "Vanuta Mihai";
        Student student = new Student(nume,29);
        assertEquals(nume,student.getNume());
    }

}
