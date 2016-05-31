package singleton;

/**
 * @author yubin.wang
 * 第二种单例模式的编写方式（懒汉方式）
 * 第一次被调用getInstance时才去实例化对象
 * 注意这是线程不安全的，如果被多线程调用可能生成多个对象。
 */
public class SecondTypeSingleton {

	private static SecondTypeSingleton instance;
	
	private SecondTypeSingleton() {
		
	}
	
	public static SecondTypeSingleton getInstance() {
		
		if (instance == null) {
			instance = new SecondTypeSingleton();
		}
		return instance;
	}
}
