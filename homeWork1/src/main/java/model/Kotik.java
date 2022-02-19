package model;

public class Kotik {

    private static int countKotik = 0;

    private String name;
    private String meow;
    private int weight;
    private int prettiness;

    private int food;

    // Getters and setters

    public String getName() {
        return this.name;
    }

    public String getMeow() {
        return this.meow;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getFood() {
        return this.food;
    }

    public static int getCountKotik(){
        return countKotik;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    // Constructors

    public Kotik (){
        countKotik++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        countKotik++;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.food = 5;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.food = 5;
    }

    // five methods behavior Kotik

    public boolean play(){
        if (food > 0){
            System.out.println(this.name + " begin play");
            this.food--;
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep(){
        if (food > 0){
            System.out.println(this.name + " sleeping");
            this.food--;
            return true;
        } else {
            return false;
        }
    }


    public boolean chaseMouse(){
        if (food > 0){
            System.out.println(this.name + " began chase mouse");
            this.food--;
            return true;
        } else {
            return false;
        }
    }

    public boolean look(){
        if (food > 0){
            System.out.println(this.name + " look in window");
            this.food--;
            return true;
        } else {
            return false;
        }
    }

    public boolean licking(){
        if (food > 0){
            System.out.println(this.name + " is licking itself");
            this.food--;
            return true;
        } else {
            return false;
        }
    }

    // three methods eat

    public void eat(){
        eat(5, "fish");
    }

    public void eat(int food){
        this.food += food;

    }

    public void eat(int food, String nameFood){
        this.food += food;
    }

    public void liveAnotherDay(){
        for (int i = 0; i <= 24; i++){
            int number = (int)(Math.random()*5);
            switch (number){
                case 0: {
                    if (play()){

                    } else {
                        eat();
                        System.out.println("Please wait, Kotik " + this.name + " very hungry, he begin eat");
                    }
                    break;
                }
                case 1: {
                    if (sleep()){

                    } else {
                        eat();
                        System.out.println("Please wait, Kotik " + this.name + " very hungry, he begin eat");
                    }
                    break;
                }
                case 2: {
                    if (chaseMouse()){

                    } else {
                        eat();
                        System.out.println("Please wait, Kotik " + this.name + " very hungry, he begin eat");
                    }
                    break;
                }
                case 3: {
                    if (look()){

                    } else {
                        eat();
                        System.out.println("Please wait, Kotik " + this.name + " very hungry, he begin eat");
                    }
                    break;
                }
                case 4: {
                    if (licking()){

                    } else {
                        eat();
                        System.out.println("Please wait, Kotik " + this.name + " very hungry, he begin eat");
                    }
                    break;
                }
            }
        }
    }
}
