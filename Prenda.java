package Polimorfismo;

public class Prenda {
    protected float precio;
    protected int talla;
    protected String material;

        public Prenda(float precio, int talla, String material) {
            this.precio = precio;
            this.talla = talla;
            this.material = material;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public String getMaterial() {
            return material;
        }

        public int getTalla(){
            return talla;
        }

        public String mostrarDatos(){
            return "Material: "+material+"\nTalla "+talla+"\nPrecio "+precio;
        }

        public float calcular_descuento(){
            return precio*(0.0f);
        }
        public float precioConDescuento(){
            return (precio-calcular_descuento());
        }
}
