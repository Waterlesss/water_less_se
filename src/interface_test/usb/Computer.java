package interface_test.usb;

public class Computer {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        Camera camera = new Camera();
        computer.fun(mouse);
        computer.fun(keyboard);
        computer.fun(camera);
    }
    public void fun(USB usb) {
        usb.plugIn();
        usb.work();
    }
}
