/**
 * 
 */
package singleton;


/**
 * @author yubin.wang
 * 第四种单例模式的编写方式
 * 用”双重检查加锁“ 保证线程安全
 * 首先检查是否实例已经创建，如果尚未创建才进行同步。
 * 因此只有第一次会涉及到同步。
 */
public class FourthTypeSingleton {
	private volatile static FourthTypeSingleton instance;
	
	private FourthTypeSingleton() {
		
	}
	
	public static FourthTypeSingleton getInstance() {
		if (instance == null) {
			synchronized (FourthTypeSingleton.class) {  // 给单例的类加锁
				if (instance == null) {
					instance = new FourthTypeSingleton();
				}
			}
		}
		return instance;
	}
}
