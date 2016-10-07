/**
 * Created by Stas on 07.10.2016.
 */
public class FlatForRenting extends Flat{
    private float price;
    private int minPeriod;

    public FlatForRenting(float totalSquare, float livingSquare, Room[] rooms, float price, int minPeriod){
        super(totalSquare, livingSquare, rooms);
        this.price = price;
        this.minPeriod = minPeriod;
    }

    public static void rent(){
        System.out.println("Flat rented: "+ price + ", public static void sale(){\n" +
                "        System.out.println(\"Flat for sale: \"+ price + \", \" + (urgent ? \"urgently\" : \"don not urgently\"));\n" +
                "    }\n" +
                "\n" +
                "    public static void sold(){\n" +
                "        System.out.println(\"Flat is sold: \"+ price);\n" +
                "    }" );
    }

    public static void rented(){
        System.out.println("Flat is sold: "+ price);
    }
}
