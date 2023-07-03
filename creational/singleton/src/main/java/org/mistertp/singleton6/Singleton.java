package org.mistertp.singleton6;

/**
 * 写法六：懒汉（双重校验锁）
 *
 * @author mistertp
 * @date 2023/7/3 下午9:58
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    /**
     * 总结：因为进行了两次if(instance == null)的检查，保证了线程的安全性。
     * <p>
     * 优点：具有lazy loading效果；线程安全；效率高。
     * <p>
     * 缺点：使用了volatile 关键字，JDK1.5以后才支持。
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
