public class Avion {
    private String model;
    private int capacitatePasageri;
    private int anFabricatie;

    public Avion() {
        this.model = "";
        this.capacitatePasageri = 100;
        this.anFabricatie = 2015;
    }

    public Avion(String model, int capacitatePasageri, int anFabricatie) {
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public void setCapacitatePasageri(int capacitatePasageri) {
        this.capacitatePasageri = capacitatePasageri;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
}
