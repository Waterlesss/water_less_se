package interface_test.usb;

public class Keyboard implements USB{
    @Override
    public void plugIn() {
        System.out.println("安装键盘驱动");
    }

    @Override
    public void work() {
        System.out.println("键盘正常工作");
    }
}
