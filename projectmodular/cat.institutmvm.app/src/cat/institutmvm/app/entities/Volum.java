package cat.institutmvm.app.entities;

public class Volum extends Obra implements IEstado,IDisponible {
    //Atributos
    protected int nro;
    //Constructor
    public Volum(String referencia, String titol, String autor, int nrePags, int nro) {
        super(referencia, titol, autor, nrePags);
        this.setNro(nro);
    }
    //getters
    public int getNro() {
        return nro;
    }
    //setters
    public void setNro(int nro) {
        this.nro = (short)nro;
    }
    //Metodos
    public String showInfo() {
        return getReferencia() + " " +
                getTitol() + " " +
                getAutor() + " " +
                getNrePags() + " " +
                nro;

    }
    //Interfaz
    @Override
    public void isNew() {
        System.out.println("El libro esta nuevo");
    }

    @Override
    public void isUsed() {
        System.out.println("El libro esta usado");
    }

    @Override
    public void isDisponible() {
        System.out.println("El libro esta disponible para prestamo");

    }

    @Override
    public void isNotDisponible() {
        System.out.println("El libro no esta disponible para prestamo");
    }

}

