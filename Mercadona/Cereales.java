package Mercadona;

import java.time.LocalDate;

public class Cereales extends ProductosAlimenticios implements EsAlimento {

    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate fc;

    private int calorias;

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
        switch (this.tipoCereal) {
            case "espelta":
                this.calorias = 5;
                break;
            case "maíz":
                this.calorias = 8;
                break;
            case "trigo":
                this.calorias = 12;
                break;
            default:
                this.calorias=15;
        }


    }


    @Override
    public void setCaducidad(LocalDate fc) {

    }

    @Override
    public LocalDate getCaducidad() {
        return fc;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public int getCalorias() {
        return calorias;
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public LocalDate getFc() {
        return fc;
    }

    public void setFc(LocalDate fc) {
        this.fc = fc;
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", fc=" + fc +
                ", calorias=" + calorias +
                '}';
    }
}
