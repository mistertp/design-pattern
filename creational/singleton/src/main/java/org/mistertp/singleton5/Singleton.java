package org.mistertp.singleton5;

/**
 * 写法五：饿汉（静态代码块）
 *
 * @author mistertp
 * @date 2023/7/3 下午9:51
 */
public class Singleton {

    private static final Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {

    }

    /**
     * 和上面的，也就是第四种效果差不多。
     * 只是把实例化过程放在了静态代码块中，也是在类装载的时候，执行静态代码块，初始化类的实例。
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}


