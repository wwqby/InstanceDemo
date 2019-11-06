package com.exzample.instancedemo;

/**
 * /*@Description 通过枚举实现单例模式
 * /*created by wwq on 2019/11/6
 * /*@company zhongyiqiankun
 */
public enum InstanceEnum {
    INSTANCE;

    private String name;

    InstanceEnum() {
        this.name = "123";
    }

}
