public class Revista extends Fitxa{
    protected int any, numero;


    public Revista(String referencia, String titol, int any, int numero) {
        super(referencia, titol);
        this.setAny(any);
        this.setNumero(numero);
    }

    public int getAny() {
        return any;
    }

    public int getNumero() {
        return numero;
    }

    public void setAny(int any) {
        this.any = (short)any;
    }

    public void setNumero(int numero) {
        this.numero = (short)numero;
    }

    @Override
    public String showInfo() {
        return getReferencia() + " " +
                getTitol() + " " +
                any + " " +
                numero;

    }
}
