public class zoo {
    String favoriteFood = "bacon";

    public void sleep(String name){
    System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String name, String food){
        if(food.equals(favoriteFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " eats " + food);
        }
    }
//    public static void main(String[] args){
//        zoo z = new zoo();
//        z.eat("Tigger", "meat");
//        z.sleep("Tiger");
//        z.eat("Tigger", "bacon");
//    }

}

