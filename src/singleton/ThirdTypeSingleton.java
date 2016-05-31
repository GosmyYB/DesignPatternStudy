/**
 * 
 */
package singleton;

/**
 * @author yubin.wang
 * 第三种单例模式的编写方式
 * 该方式虽然保证了线程安全，但性能将大幅下降
 * 因为每次调用时都涉及到同步
 */
public class ThirdTypeSingleton {

	private static ThirdTypeSingleton instance;
	
	private ThirdTypeSingleton() {
	}
	
	public static synchronized ThirdTypeSingleton getInstance() {
		if (instance == null) {
			instance = new ThirdTypeSingleton();
		}
		return instance;
	}
}
