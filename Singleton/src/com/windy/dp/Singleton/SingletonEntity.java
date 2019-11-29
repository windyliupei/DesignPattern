package com.windy.dp.Singleton;


/*饱汉模式(懒汉模式)*/

/*
优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
缺点：非线程安全。
*/
public class SingletonEntity {

    private static SingletonEntity singletonEntity = null;

    private SingletonEntity(){
    }

    public static SingletonEntity getInstance(){
        if (singletonEntity==null){
            singletonEntity = new SingletonEntity();
        }
        return singletonEntity;
    }
}
