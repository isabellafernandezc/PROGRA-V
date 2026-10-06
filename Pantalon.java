package Polimorfismo;

public class Pantalon extends Prenda {
    private String tipo_pantalon;

    public Pantalon(float precio, int talla, String material, String tipo_pantalon) {
        super(precio, talla, material);
        this.tipo_pantalon = tipo_pantalon;
    }

    public String gettipo_pantalon() { return tipo_pantalon; }
    
    @Override
    public String mostrarDatos() {
        return "Pantalon \n" + super.mostrarDatos() + "\nTipo de Pantalon: " + tipo_pantalon;
    }

    @Override
    public float calcular_descuento(){
            return this.precio * 0.15f;
        }

}