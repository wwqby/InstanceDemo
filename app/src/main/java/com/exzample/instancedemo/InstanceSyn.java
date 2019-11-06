package com.exzample.instancedemo;

/**
 * /*@Description 双重校验所单例模式
 * /*created by wwq on 2019/11/6
 * /*@company zhongyiqiankun
 */
public class InstanceSyn {

    private volatile static InstanceSyn sInstanceSyn;

    private  InstanceSyn() {
    }

    public static  InstanceSyn getInstance(){
        if (sInstanceSyn==null){
            synchronized (InstanceSyn.class){
                if (sInstanceSyn==null){
                    sInstanceSyn=new InstanceSyn();
                }
            }
        }
        return sInstanceSyn;
    }

}
