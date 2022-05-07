package interface_test.usb;

public class Computer {

    public static void main(String[] args) {
        Computer computer = new Computer();
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();
        USB camera = new Camera();
        computer.fun(mouse);
        computer.fun(keyboard);
        computer.fun(camera);
    }
    public void fun(USB usb) {
        usb.plugIn();
        usb.work();
    }
}
