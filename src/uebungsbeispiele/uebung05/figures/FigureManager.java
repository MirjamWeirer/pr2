package uebungsbeispiele.uebung05.figures;

import java.util.ArrayList;
import java.util.HashMap;


public class FigureManager {
    private ArrayList<Figure> figure;

    public FigureManager(){
        figure = new ArrayList();
    }

    public void addFigure (Figure f){
        figure.add(f);
    }

    public double getMaxPerimeter(){
        double maxPerimeter = 0.0;
        for (Figure f : figure){
            if (f.getPerimeter() > f.getPerimeter() +1){
                maxPerimeter = f.getPerimeter();
            }
        }
        return maxPerimeter;
    }

    public double getAverageAreaSize(){
        double sum = 0.0;
        int anz = 0;
        for (Figure f: figure){
            anz++;
            sum += f.getArea();
        }
        return sum/anz;
    }

    public HashMap<String, Double>getAreaBySizeCategories(){
        HashMap<String, Double> categorie = new HashMap<>();
        double sum = 0.0;
        for (Figure f : figure){
            sum += f.getArea();
        }
        if (sum < 1000){
            categorie.put("Klein", sum);
        }else if (sum >=1000 && sum <5000){
            categorie.put("Mittel",sum);
        }else {
            categorie.put("Groß",sum);
        }
        return categorie;
    }
}
