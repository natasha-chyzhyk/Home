/**
 * Created by Stas on 07.10.2016.
 */
public class FlatRorSale extends Flat{
    private float price;
    private boolean urgent;

    public void setPrice(float price){
        this.price = price;
    }

    public void setUrgent(boolean urgent){
        this.urgent = urgent;
    }

    public float getPrice() {
        return price;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public static void sale(){
        System.out.println("Flat for sale: "+ price + ", for a minimum period" +urgent);
    }

    public static void sold(){
        System.out.println("Flat is sold: "+ price);
    }
}
