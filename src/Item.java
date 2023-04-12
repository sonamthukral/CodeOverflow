public class Item {
    //instance
    private String name;
    private String binColor;

    //constructor
    public Item (String n, String b) {
        name = n;
        binColor = b;
    }

    public String getName() {
        return name;
    }

    public String getBinColor() {
        return binColor;
    }

    public String toString() {
        return name;
    }

}