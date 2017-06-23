package proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 事务控制代理
 * Created by wyb.
 */
public class TransactionHandler implements InvocationHandler {

    private UserMgr target;

    public TransactionHandler(UserMgr target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Transaction Start");
        method.invoke(target); // 调用被代理对象代理方法
        System.out.println("Transaction Commit");
        return proxy;
    }
}
