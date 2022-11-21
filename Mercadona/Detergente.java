package Mercadona;

public class Detergente implements ConDescuento, EsLiquido {

    private String marca;
    private double precio;
    private double volumen;
    private double des;

    private String env;


    public Detergente(String marca, double precio){
        this.marca=marca;
        this.precio=precio;

    }

    @Override
    public void setDescuento(double des) {

    }

    @Override
    public double getDescuento() {
        return this.des;
    }

    @Override
    public double getPrecioDescuento() {
        return precio-(precio*getDescuento());
    }

    @Override
    public void setVolumen(double v) {

    }



    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String env) {

    }

    @Override
    public String getTipoEnvase() {
        return this.env;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", volumen=" + volumen +
                ", des=" + des +
                ", env='" + env + '\'' +
                '}';
    }
}
