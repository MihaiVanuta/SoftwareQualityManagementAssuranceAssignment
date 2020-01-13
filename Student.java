public class Student {
    private String nume;
    private int varsta;

    public Student(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Student(){
        this.nume = "";
        this.varsta = 19;
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
}
