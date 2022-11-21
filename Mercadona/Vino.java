package Mercadona;

public class Vino extends ProductosAlimenticios implements ConDescuento, EsLiquido {

    private String marca;
    private double precio;
    private double graduación;
    private String tipo;

    private double des;

    private String env;

    private double volumen;
    private double calorias;


    public Vino(String marca, String tipo, double precio, double graduación){
        this.marca=marca;
        this.tipo=tipo;
        this.precio=precio;
        this.graduación=graduación;
        this.calorias=graduación*10;
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
        return this.marca;
    }

    public String getMarca() {
        return marca;
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

    public double getGraduación() {
        return graduación;
    }

    public void setGraduación(double graduación) {
        this.graduación = graduación;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", graduación=" + graduación +
                ", tipo='" + tipo + '\'' +
                ", des=" + des +
                ", env='" + env + '\'' +
                ", volumen=" + volumen +
                ", calorias=" + calorias +
                '}';
    }
}
