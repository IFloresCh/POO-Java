package cat.institutmvm.app.entities;

public class Obra extends Fitxa {

    private String autor;
    private int nrePags;

    public Obra(String referencia, String titol, String autor, int nrePags) {
        super(referencia, titol);
        this.setAutor(autor);
        this.setNrePags(nrePags);
    }

    public String getAutor() {
        return autor;
    }

    public int getNrePags() {
        return nrePags;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNrePags(int nrePags) {
        this.nrePags = (short) nrePags;
    }

    @Override
    public String showInfo() {
        return getReferencia() + " " +
                getTitol() + " " +
                autor + " " +
                nrePags;
    }
}
