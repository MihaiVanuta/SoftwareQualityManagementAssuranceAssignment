import org.junit.Test;

import static org.junit.Assert.*;

public class MasinaTest {

    @Test
    public void checkSetModel(){
        String model = "Dacia";
        double pret = 1000.23;
        Masina masina = new Masina(model,pret);
        assertEquals(model,masina.getModel());
    }

}
