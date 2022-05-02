package interface_test.usb;

public class Camera implements USB{
    @Override
    public void plugIn() {
        System.out.println("安装相机驱动中");
    }

    @Override
    public void work() {
        System.out.println("相机开始正常工作");
    }
}
