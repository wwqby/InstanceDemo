package com.exzample.instancedemo;

/**
 * /*@Description 通过静态内部类实现单例
 * /*created by wwq on 2019/11/6
 * /*@company zhongyiqiankun
 */
public class InstanceSta {

    private static class InstanceStaHolder{
        private static final InstanceSta mInstanceSta =new InstanceSta();
    }

    private InstanceSta() {
    }

    public static InstanceSta getInstance(){
        return InstanceStaHolder.mInstanceSta;
    }
}
