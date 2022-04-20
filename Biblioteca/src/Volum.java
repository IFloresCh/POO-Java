public class Volum extends Obra{
    protected int nro;

    public Volum(String referencia, String titol, String autor, int nrePags, int nro) {
        super(referencia, titol, autor, nrePags);
        this.setNro(nro);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = (short)nro;
    }

    public String showInfo() {
        return getReferencia() + " " +
                getTitol() + " " +
                getAutor() + " " +
                getNrePags() + " " +
                nro;
    }

}
