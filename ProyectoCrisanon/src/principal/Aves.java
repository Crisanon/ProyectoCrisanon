package principal;

public class Aves extends Producto {

    // Attributes
    private String tipo;

    // Constructors
    public Aves() {
    }

    public Aves(String nombre, double precioUnit, int cantStock,
                boolean disponible, String tipo) {
        super(nombre, precioUnit, cantStock, disponible);
        this.tipo = tipo;
    }

    // Methods
    @Override
    public String toString() {
        return "Aves\n" + super.toString() + "Tipo: "
                + this.tipo;
    }

    // Gets and Sets
    public String getTipo() {
        return tipo;
    }

    public void setGenero(String tipo) {
        this.tipo = tipo;
    }
}
