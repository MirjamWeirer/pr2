package einheit3;

public class Dog implements Comparable<Dog> {
    public String eyeColor;
    public int weight;

    public Dog(){
        eyeColor="braun";
        weight =1;
    }
    public Dog(String eC, int w){
        eyeColor = eC;
        weight = w;
    }
    public void bark(){
        System.out.println("Bark bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
    //we want to sort them by weight
    @Override
    public int compareTo(Dog o) {
        //((Integer)this.weight).compareTo(); -> weitere möglichkeit
        //Integer.compare(this.weight,o.weight); -> Alternativ wrapper
        if (this.weight < o.weight){
            return -1;
        }
        if (this.weight > o.weight){
            return 1;
        }
        //here we can assume weight is the same
        return 0;
    }
}
