package spring.factory;


import java.io.IOException;
import java.util.Properties;

/**
 * Created by wyb.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        // ① 拿到 当前类的类对象
        // ② 拿到 通过类对象拿到 ClassLoader
        // ③ getResourceAsStream 从类路径的根目录(bin)开始读取 某个文件
        props.load(Test.class.getClassLoader().getResourceAsStream("spring/factory/spring.properties"));
        String vehicleTypeName = props.getProperty("VehicleType");
        System.out.println(vehicleTypeName);
       // Object o = Class.forNanme(vehicleTypeName).newInstance();
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
       // Movable m = (Movable)o;
       // m.run();
    }
}
