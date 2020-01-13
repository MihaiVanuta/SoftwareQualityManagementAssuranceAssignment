public class Profesor {
    private String nume;
    private int varsta;
    private int vechime;

    public Profesor(String nume, int varsta, int vechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.vechime = vechime;
    }

    public Profesor(){
        this.nume = "";
        this.varsta = 30;
        this.vechime = 1;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
}
