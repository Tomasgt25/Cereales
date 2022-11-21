package Mercadona;


public class Main {

    public static void main(String[] args) {
        ProductosAlimenticios[] lista = new ProductosAlimenticios[5];
        Cereales cereal1 = new Cereales("Kellogs", "trigo", 4.35d);
        Cereales cereal2 = new Cereales("Kellogs", "espelta", 3.00d);
        Cereales cereal3 = new Cereales("Kellogs", "maíz", 5.60d);
        Vino vino1 = new Vino("Pago", "tinto", 27.99d, 18.70d);
        Vino vino2 = new Vino("Pago", "blanco", 17.99d, 8.70d);

        lista[0] = cereal1;
        lista[1] = cereal2;
        lista[2] = cereal3;
        lista[3] = vino1;
        lista[4] = vino2;
         int contCal;

        for (ProductosAlimenticios item : lista) {
            if (item instanceof Cereales){
                ((Cereales) item).getCalorias();
            }
        }
    }



}
