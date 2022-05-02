package interface_test.usb;

public class Mouse implements USB{

    @Override
    public void plugIn() {
        System.out.println("安装鼠标驱动");
    }

    @Override
    public void work() {
        System.out.println("鼠标正常工作");
    }
}
