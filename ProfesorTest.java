import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {

    @Test
    public void checkSetVechime(){
        int vechime = 10;
        Profesor profesor = new Profesor("Ion Daniel",44,vechime);
        assertEquals(vechime,profesor.getVechime());
    }

}
