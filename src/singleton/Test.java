package singleton;

/**
 * Created by wyb on 2017/3/1.
 */
public class Test {
    public static void main(String[] args) {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        instance.add();
        instance.add();
        instance.add();
        instance.setName("name has been set");
        StaticInnerClassSingleton anOther = StaticInnerClassSingleton.getInstance();
        anOther.add();
        anOther.add();

        System.out.println(anOther.getCount());
        System.out.println(anOther.getName());
    }
}
