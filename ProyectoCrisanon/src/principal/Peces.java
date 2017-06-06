package principal;

public class Peces extends Producto {

    // Attributes
    private String tipo;

    // Constructors
    public Peces() {
    }

    public Peces(String nombre, double precioUnit, int cantStock,
                 boolean disponible, String tipo) {
        super(nombre, precioUnit, cantStock, disponible);
        this.tipo = tipo;
    }

    // Methods
    @Override
    public String toString() {
        return "Peces\n" + super.toString() + "Tipo: "
                + this.tipo;
    }

    // Gets and Sets
    public String getTipo() {
        return tipo;
    }

    public void setTematica(String tipo) {
        this.tipo = tipo;
    }
}
