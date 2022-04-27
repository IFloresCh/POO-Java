package cat.institutmvm.applicacio.entities;

public class Persona {

    private String referencia, titol;


    public Persona(String referencia, String titol) {
        this.setReferencia(referencia);
        this.setTitol(titol);
    }

    public Persona() {

    }


    public String getReferencia() {
        return referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }


}
