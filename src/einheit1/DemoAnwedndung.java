package einheit1;

public class DemoAnwedndung {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(4,6);
        Fraction f3 = new Fraction(2,5);

        System.out.println("f1 Numerator: " + f1.getNumerator());
        System.out.println("f1 Denomiator: " + f1.getDenominator());
        System.out.println("f2 Numerator: " + f2.getNumerator());
        System.out.println("f2 Denomiator: " + f2.getDenominator());
        System.out.println("f3 Numerator: " + f3.getNumerator());
        System.out.println("f3 Denomiator: " + f3.getDenominator());
        f1.toDecimal();
        f1.print();
        f2.multiplicate(f2).print();
        f1.multiplicate(f2,f3).print();
        f1.add(f2).print();
        System.out.println(Fraction.getNrFractions());
    }
}
