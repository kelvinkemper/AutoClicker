import java.awt.event.InputEvent;
import java.util.Scanner;
import java.lang.Thread;

public class AutoClickerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   AutoClicker   ");

        System.out.println("Enter the number of clicks you need: ");
        int clicks = scanner.nextInt();
        System.out.println();

        System.out.println("Enter the delay between the clicks in ms:");
        int delay = scanner.nextInt();
        System.out.println();

        System.out.println("Program will start in 10 seconds.");

        try {
            Thread.sleep(3000);
        } catch(Exception e) {
            e.printStackTrace();
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delay);

        for(int i = 0; i < clicks; i++) {
            clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
        }

        System.out.println("AutoClicker Completed.");

    }
}
