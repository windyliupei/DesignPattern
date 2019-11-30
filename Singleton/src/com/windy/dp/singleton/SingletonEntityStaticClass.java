package com.windy.dp.singleton;


/*静态内部内(建议使用)*/

/*
定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。
而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，
由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。

类级内部类只有在第一次被使用的时候才被会装载。

优点：达到了lazy loading的效果，即按需创建实例
*/
public class SingletonEntityStaticClass {

    private SingletonEntityStaticClass(){
    }

    private static class SingletonHolder{
        private final static SingletonEntityStaticClass instance=new SingletonEntityStaticClass();
    }

    public static SingletonEntityStaticClass getInstance(){
        return SingletonHolder.instance;
    }
}
