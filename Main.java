package Polimorfismo;

import java.util.ArrayList;

public class Main {
    
    
    public static void main(String[] args) {

        //Ejemplos de prendas creadas
        Camiseta camisetaCuadros = new Camiseta(60000, 30, "Algodón", "Corta");
        Camiseta camisetaPolo = new Camiseta(75000, 30, "Algodón", "Corta");
        Pantalon pantalon = new Pantalon(150000, 32, "Jean", "Jeans");
        //Abrigo abrigo = new Abrigo(150000, 38, "Poliéster", "Chaqueta");

        ArrayList<Prenda> prendas = new ArrayList<>();
        System.out.println("--Bienvenido al Sistema de Gestión de tiendas ZARA--");
        prendas.add(camisetaCuadros);
        prendas.add(camisetaPolo);
        prendas.add(pantalon);
        //prendas.add(abrigo);

        System.out.print("Cargando base de datos");
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000);
                    System.out.print(".");
                }
            } 
            catch (InterruptedException e) {
                System.out.println("\nCarga interrumpida.");
            }
        

        System.out.println("\n");
        int total =0;
        for (Prenda prenda : prendas) {
            System.out.println(prenda.mostrarDatos());
            System.out.println("Descuento: $" + prenda.calcular_descuento());
            System.out.println("Precio final: $" + prenda.precioConDescuento());
            System.out.println();

            total += prenda.precioConDescuento();
        }
        System.out.println("TOTAL A PAGAR: $" + total);

    }
}
