package org.mistertp.singleton7;

/**
 * 写法七：懒汉（静态内部类）
 *
 * @author mistertp
 * @date 2023/7/3 下午10:02
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonKeeper.instance;
    }

    /**
     * 利用classloader的机制来保证初始化instance实例时只有一个线程。
     * 和写法四 和 写法五，还是有区别的（只要Singleton类被装载，那么instance就会被实例化，也就没有lazy loading效果）。
     * 而此写法，当Singleton类被装载了，instance不一定被实例化，因为SingletonKeeper类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonKeeper类，从而实例化instance。
     * <p>
     * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
     * <p>
     * 优点：避免了线程不安全，延迟加载，效率高。
     */
    private static class SingletonKeeper {
        private static final Singleton instance = new Singleton();
    }
}
