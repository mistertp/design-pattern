package org.mistertp;

/**
 * description
 *
 * @author mistertp
 * @date 2023/7/4 下午10:22
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doSomething();
    }
}
