package proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wyb.
 */
public class Client {
    public static void main(String[] args) {
        UserMgr userMgr = new UserMgrImpl(); // 被代理的对象
        InvocationHandler h = new TransactionHandler(userMgr); // 代理处理器
        UserMgr u = (UserMgr) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{UserMgr.class}, h); // 生成被代理处理器包装的对象
        u.addUser(); // 被代理后的方法调用
    }
}
