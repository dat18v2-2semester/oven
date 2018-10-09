import java.util.Scanner;

public class Kitchen {

    public static void main(String[] args)  {

        Oven oven = new Oven(0);

        Thread t = new Thread();
        Scanner input = new Scanner(System.in);
        input.nextInt();

        System.out.println("Program kørør");

        try {
            t.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Program kører videre");

        if (oven.getState() == 0) {
            oven.turnOn();
        } else if(oven.getState() == 1){
            oven.tooHot();

        } else if (oven.getState() == 2) {

        }



    }

}
