package org.mistertp.singleton4;

/**
 * 写法四：饿汉（静态变量）
 *
 * @author mistertp
 * @date 2023/7/3 下午9:48
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    /**
     * 优点：写法简单，在类装载阶段就完成实例化（单例模式中，大多数是调用getInstance()方法时类装载）。
     * 基于classloader机制，避免线程同步问题。
     * <p>
     * 缺点：没有lazy loading效果。如果一直没有使用这个实例，会造成内存的浪费。
     *
     * @return
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

}

