package principal;
import leer.Leer;

public class Test {

    public static void main(String[] args) {
    /*
     * Sólo se debe añadir métodos para establecer los valores de los atributos, poder imprimirlos datos en pantalla y calcular cantidad a pagar según el precio de venta. De momento, no hace falta gestionar el almacén con los artículos que quedan, sólo se pedirá la cantidad de artículos que lleva el cliente y se dará el precio a pagar según esa cantidad.
     */

        System.out.println("Bienvenido a la tienda de Juan\n--------\n"+
                "El usuario puede:\n"+
                "\t Comprar animales.\n"+
                "\t Añadir nuevos animales a la cesta.\n"+
                "\t Consultar el importe de la cuenta.");

        boolean continuar = true;
        int lecturaProducto, lecturaCantidad; //Variables para seleccionar el producto y la cantidad que se quiere comprar

        //Se instancian y cargan los productos
        Producto pajaro1 = new Aves("Canario", 5.44, 11, true, "Diurno");
        Producto pajaro2 = new Aves("Gamusino", 42.4, 32, true, "Nocturno");
        Producto bicho1  = new Reptiles("Camaleon", 50.5, 1, true, "Diurno");
        Producto bicho2  = new Reptiles("Lagarto Comun", 10.5, 9, true, "Diurno");
        Producto pez1 = new Peces("Tiburon", 32.12, 0, false, "Nocturno");
        Producto pez2 = new Peces("Raya", 88.8, 13, false, "Nocturno");

        //Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
        //instancia el contructor de Producto
        Producto catalogo[] = new Producto[Producto.dimesionArray];
        //Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
        Gestion gestion = new Gestion();

        //Se rellena el array catálogo
        catalogo[0] = pajaro1;
        catalogo[1] = pajaro2;
        catalogo[2] = bicho1;
        catalogo[3] = bicho2;
        catalogo[4] = pez1;
        catalogo[5] = pez2;

        do {
            System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
                    +"1. Mostrar animales\n"
                    +"2. Vender animales\n"
                    +"3. Mostrar caja\n"
                    +"Para salir pulse cualquier otro número\n"
            );
            switch (Leer.datoInt()) {
                case 1:
                    gestion.mostrarProductos(catalogo);
                    break;
                case 2:
                    System.out.println("¿Que animal desea comprar?");
                    gestion.mostrarNombreProductos(catalogo);
                    lecturaProducto=Leer.datoInt();
                    System.out.println("¿Cuántos desea comprar?");
                    lecturaCantidad=Leer.datoInt();
                    //Se carga el producto y la cantidad solicitada por el usuario
                    gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
                    break;
                case 3:
                    System.out.println(gestion.mostrarCaja() +" €");
                    break;
                default:
                    //Se sale del programa
                    continuar=false;
            }

        } while(continuar);

        System.out.println("------- Gracias por usar el programa. -------");

    }

}