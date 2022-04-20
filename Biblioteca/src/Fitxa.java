public abstract class Fitxa {

    private String referencia, titol;


    public Fitxa(String referencia, String titol) {
        this.setReferencia(referencia);
        this.setTitol(titol);
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

    public abstract String showInfo();
}
