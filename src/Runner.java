import java.util.ArrayList;
public class Runner {

    public static void main(String[] args){
        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Bee stinger = new Bee("Stinger");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        tigger.eat("meat");
        tigger.eat("kibble");
        pooh.eat("fish");
        pooh.eat("meat");
        rarity.eat("marshmallows");
        gemma.eat("meat");
        gemma.eat("leaves");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        animals.add(tigger);
        animals.add(pooh);
        animals.add(stinger);
        animals.add(rarity);
        animals.add(gemma);
        zoebot.feedAnimals(animals, "feed");

    }
}
