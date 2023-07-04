package org.mistertp;

/**
 * description
 *
 * @author mistertp
 * @date 2023/7/4 下午10:17
 */
public class Context {

    /**
     * 抽象策略
     */
    private Strategy strategy;

    /**
     * 设置具体策略
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后的策略方法
     */
    public void doSomething() {
        this.strategy.doSomething();
    }
}
