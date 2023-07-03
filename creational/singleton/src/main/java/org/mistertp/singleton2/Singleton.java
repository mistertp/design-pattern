package org.mistertp.singleton2;

/**
 * 写法二：懒汉（线程安全，同步方法）
 *
 * @author mistertp
 * @date 2023/7/3 下午9:32
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 通过在方法前加关键字synchronized来起到线程同步的作用，解决线程不安全问题。
     * 具备lazy loading效果
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

