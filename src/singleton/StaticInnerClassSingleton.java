package singleton;

/**
 * Created by wyb on 2017/2/24.
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        System.out.println("In constructor");
    }
    private static class SingletonHolder {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton instance = null;
        System.out.println("creating instance"); // prints before constructor
        instance = StaticInnerClassSingleton.getInstance();
    }
}
