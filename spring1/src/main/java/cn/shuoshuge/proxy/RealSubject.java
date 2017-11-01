package cn.shuoshuge.proxy;

public class RealSubject implements Subject {
    public void sayHellp() {
        System.out.println("hello----------");
    }

    public void save() {
        System.out.println("save-----------");
    }
}
