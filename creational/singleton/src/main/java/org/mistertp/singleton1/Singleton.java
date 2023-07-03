package org.mistertp.singleton1;

/**
 * 经典单例模式（延迟实例化）
 * 懒汉（线程不安全）
 *
 * @author mistertp
 * @date 2023/7/2 下午10:34
 */
public class Singleton {

    /**
     * 定义单例全局变量
     */
    private static Singleton instance;

    /**
     * 私有化构造函数
     */
    private Singleton() {

    }

    /**
     * 提供获取实例的公共静态方法
     * <p>
     * 这种写法起到了lazy loading的效果，即先判断实例是否存在，不存在的情况，再实例化。但是只能在单线程的情况下使用。
     * 在多线程的情况下，假如A线程进入到if(instance == null), 但是B线程已经执行到 instance = new Singleton()， 这种情况下，就会产生产生多个实例，未达到单例的效果。
     *
     * @return Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(anotherSingleton);
    }

}

