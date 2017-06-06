package principal;

public class Reptiles extends Producto {

    //Attribute
    private String tipo;


    //Constructor
    public Reptiles() { }
    public Reptiles(String nombre, double precioUnit, int cantStock, boolean disponible, String tipo) {
        super(nombre, precioUnit, cantStock, disponible);
        this.tipo = tipo;
    }


    //Methods
    @Override
    public String toString() {
        return  "Reptiles\n"+
                super.toString()+
                "Tipo: "  +this.tipo;
    }

    //Gets and Sets
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String director) {
        this.tipo = director;
    }
}