import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(10,"Murzik",3,"Meow");
        Kotik kotik2 = new Kotik();

        kotik2.setKotik(6,"Musya",2,"Meow meow");

        kotik2.liveAnotherDay();

        if (kotik1.getMeow().equals(kotik2.getMeow())){
            System.out.println(kotik1.getName() + " and " + kotik2.getName() + " have equal meow");
        } else System.out.println(kotik1.getName() + " and " + kotik2.getName() + "have not equal meow");

        System.out.println("Was created " + Kotik.getCountKotik() + " Kotik");

    }
}
