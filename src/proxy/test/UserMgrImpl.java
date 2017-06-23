package proxy.test;

/**
 * Created by wyb.
 */
public class UserMgrImpl implements UserMgr {
    @Override
    public void addUser() {
        // 控制前后 transaction
        System.out.println("1: 插入记录到 User 表");
        System.out.println("2: 做日志在另外一张表");
    }
}
