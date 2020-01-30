import java.awt.Robot;

/**
 * autoclicks (will add more options later)
 * https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html
 */

public class AutoClicker {

    //robot will handle clicking
    private Robot robot;
    //store delay between clicks in ms
    private int delay;

    //constructor
    public AutoClicker() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        delay = 300;
    }

    /**
     * * @param leftButton presses left button
     *
     */
    public void clickMouse(int leftButton) {
        try {
            robot.mousePress(leftButton);
            robot.delay(250);
            robot.mouseRelease(leftButton);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int ms) {
        this.delay = ms;
    }
}
