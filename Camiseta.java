package Polimorfismo;

public class Camiseta extends Prenda {
    private String tipo_manga;

    public Camiseta(float precio, int talla, String material, String tipo_manga) {
        super(precio, talla, material);
        this.tipo_manga = tipo_manga;
    }

    public String gettipo_manga() { return tipo_manga; }
    
    @Override
    public String mostrarDatos() {
        return "Camiseta \n" + super.mostrarDatos() + "\nTipo de manga: " + tipo_manga;
    }

    @Override
    public float calcular_descuento(){
            return this.precio * 0.10f;
        }
 

}
