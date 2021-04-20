package uebungsbeispiele.uebung01;

public class OrderApp {
    public static void main(String[] args) {
        Article buch = new Article("Zwischenzeit",2,10.5);
        Order order1 = new Order(3);
        buch.getName();
        System.out.println(buch);
        System.out.println(order1);
        //order1.addArticle(buch);
    }
}
