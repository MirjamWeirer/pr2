package einheit1;

public class Fraction {
    private int numerator;
    private int denominator;
    private static int nrFractions = 0;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        nrFractions++;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal(){
        double result = (double)this.numerator / (double) this.denominator;
        System.out.println(result);
        return result;
    }

    public void print(){
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public Fraction multiplicate (Fraction f2){
        Fraction newFraction = new Fraction(f2.numerator * f2.numerator,f2.denominator * f2.denominator);
        //print();
        return newFraction;
    }

    public Fraction multiplicate (Fraction f2, Fraction f3){
        Fraction newFreaction = new Fraction(f2.numerator* f3.numerator, f2.denominator* f3.denominator);
        //print();
        return newFreaction;
    }

    public Fraction add(Fraction f2){
        Fraction newFraction = new Fraction(f2.numerator + f2.numerator, f2.denominator+f2.denominator );
        //print();
        return newFraction;
    }
    public static int getNrFractions(){
        nrFractions++;
        System.out.println(nrFractions);
        return nrFractions;
    }
}
