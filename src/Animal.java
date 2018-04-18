public class Animal {
    static int population = 0;
    String name;
    String favoriteFood;

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps for 3 hours");
    }

    public int populationCount(){
        return population;
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!! " + this.name + " wants more " + food);
            this.sleep();
        }else{
            System.out.println(this.name + " eats " + food);
            this.sleep();
        }
    }

}
