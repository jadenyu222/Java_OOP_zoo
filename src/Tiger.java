public class Tiger {
    String name;
    String favoriteFood;

    public Tiger(String name) {
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        if(food.equals(this.favoriteFood)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!! " + this.name + " wants more " + food);
        }else{
            System.out.println(this.name + " eats " + food);
            sleep();
        }
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }

}
