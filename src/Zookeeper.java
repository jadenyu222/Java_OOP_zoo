import java.util.ArrayList;

public class Zookeeper {
    String name;


    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> a, String food){

    System.out.println(this.name + " is feeding " + food + " to " + a.size() + " of " + Animal.population + "animals");
    for(int i = 0; i < a.size(); i++){
        a.get(i).eat(food);
    }
    }
}
