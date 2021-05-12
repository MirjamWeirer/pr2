package uebungsbeispiele.uebung01;

import uebungsbeispiele.uebung01.Article;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private  Article [] articles;
    private int capacityOrder;

    public Order( int capacityOrder){
        this.nrArticles = 0;
        articles = new Article[capacityOrder];
        this.capacityOrder = capacityOrder;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    public int getNrArticles() {
        return nrArticles;
    }

    @Override
    public String toString() {
        return "Bestellung {" + "articles = " + Arrays.toString(articles) + '}';
    }

    public void addArticle(Article a){
        if (nrArticles >= capacityOrder){
            inercreaseArray();
        }
        articles[nrArticles ++] = a;
    }

    public void inercreaseArray(){
        System.out.println("Kapazität erhöht");
        Article [] newArt = new Article[capacityOrder + 10];

        for (int i = 0; i < nrArticles; i++){
            newArt[i] = articles[i];
        }

        articles = newArt;
        capacityOrder = capacityOrder +10;
    }

    public void removeArticle(int nr){
        if (nr >0 && nr <= nrArticles){
            for (int i = nr -1; i < nrArticles -1; i++){
               articles[i] = articles[i+1];
            }
            articles[nrArticles-1]= null;
            --nrArticles;
        }
    }
}
