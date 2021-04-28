package einheit3;

public class PropertyDemo {
    public static void main(String[] args) {
        Property property1 = new Property(47.34,15.01,300,"Mirjam");
        property1.addOwner("Sparkasse",1555.55);
        System.out.println(property1.payback("Sparkasse",200));
        System.out.println(property1.removeOwener("Raiffeisen"));
        System.out.println(property1.removeOwener("Sparkasse"));
    }
}
