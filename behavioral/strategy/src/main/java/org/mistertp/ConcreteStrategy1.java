package org.mistertp;

/**
 * description
 *
 * @author mistertp
 * @date 2023/7/4 下午10:16
 */
public class ConcreteStrategy1 implements Strategy{

    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
