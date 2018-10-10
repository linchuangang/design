package single;

//双检锁/双重校验锁（DCL，即 double-checked locking）
//JDK 版本：JDK1.5 起
//
//是否 Lazy 初始化：是
//
//是否多线程安全：是
//
//实现难度：较复杂
public class Singleton4 {
    private volatile static Singleton4 singleton;

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
