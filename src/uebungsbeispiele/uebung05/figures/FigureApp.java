package uebungsbeispiele.uebung05.figures;


public class FigureApp {
    public static void main(String[] args) {
        Rectangle figure1 = new Rectangle(30,50);
        Circle figure2 = new Circle(22);
        FigureManager f = new FigureManager();
        System.out.println( figure1.getArea());
        System.out.println(figure1.getPerimeter());
        System.out.println(figure2.getArea());
        System.out.println(figure2.getPerimeter());

        f.addFigure(figure1);
        f.addFigure(figure2);

        System.out.println(f.getAverageAreaSize());
        System.out.println(f.getMaxPerimeter());
        System.out.println(f.getAreaBySizeCategories());
    }
}
