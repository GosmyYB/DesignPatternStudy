package factory;

/**
 * Created by wyb.
 */
public class Car implements Movable {

    // 单例
    private static Car instance = new Car();

    public Car() {

    }

    // 静态工厂方法:在自身控制了产生对象的逻辑
    public static Car getInstance() {
        return instance;
    }

    public void run() {
        System.out.println("冒着烟奔跑中 car.....");
    }
}
