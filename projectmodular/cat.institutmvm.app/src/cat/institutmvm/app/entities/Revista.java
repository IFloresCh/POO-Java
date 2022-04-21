package cat.institutmvm.app.entities;

public class Revista extends Fitxa implements IEstado, IDisponible{
    //atributos
    protected int any, numero;

    //constructor
    public Revista(String referencia, String titol, int any, int numero) {
        super(referencia, titol);
        this.setAny(any);
        this.setNumero(numero);
    }
    //getters
    public int getAny() {
        return any;
    }

    public int getNumero() {
        return numero;
    }
    //setters
    public void setAny(int any) {
        this.any = (short)any;
    }

    public void setNumero(int numero) {
        this.numero = (short)numero;
    }
    //metodos
    @Override
    public String showInfo() {
        return getReferencia() + " " +
                getTitol() + " " +
                any + " " +
                numero;

    }
    //interfaz
    @Override
    public void isNew() {
        System.out.println("La revista esta nueva");
    }

    @Override
    public void isUsed() {
        System.out.println("La revista esta usada");
    }

    @Override
    public void isDisponible() {
        System.out.println("La revista esta disponible para prestamo");
    }

    @Override
    public void isNotDisponible() {
        System.out.println("La revista no esta disponible para prestamo");
    }
}

