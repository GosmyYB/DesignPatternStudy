/**
 * 
 */
package singleton;

/**
 * @author yubin.wang
 * 第一种单例模式的编写方式（饿汉方式）
 * 初始化时便实例化了一个对象
 * 此后程序中该类只会用该对象
 */
public class FirstTypeSingleton {
	private static FirstTypeSingleton instance = new FirstTypeSingleton();
	
	private FirstTypeSingleton() {
	}
	
	public static FirstTypeSingleton getInstance() {
		return instance;
	}
}
