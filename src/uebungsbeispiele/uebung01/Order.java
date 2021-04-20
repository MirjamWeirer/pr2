package uebungsbeispiele.uebung01;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int articles[];
    private int capacityOrder;
    private Article a = new Article("a",1,1);
    private Object Article;

    public Order( int capacityOrder){
        this.nrArticles = 0;
        int articles[] = new int[capacityOrder];
        this.articles = articles;
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
        return "Bestellung {" + "nrArticles=" + nrArticles + "capacityOrder=" + capacityOrder + "articles=" + Arrays.toString(articles) + '}';
    }

    public void addArticle(Article a){
        for (int i = 0; i < articles.length; i++){
            articles[i] = (int) Article;
            System.out.println(articles[i]);
        }
    }
}
