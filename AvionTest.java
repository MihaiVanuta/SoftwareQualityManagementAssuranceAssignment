import org.junit.Test;

import static org.junit.Assert.*;

public class AvionTest {

    @Test
    public void checkSetModel(){
        String model = "Boeing 747";
        int capacitate = 172;
        int anFabricatie = 2018;
        Avion avion = new Avion(model,capacitate,anFabricatie);
        assertEquals(model,avion.getModel());
    }
}
