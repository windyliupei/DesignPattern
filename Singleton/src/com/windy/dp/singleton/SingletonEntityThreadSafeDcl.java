package com.windy.dp.singleton;


/*饱汉模式(懒汉模式)--多线程写法 双重检查锁(DCL)*/

/*
经过改造静态工厂,使其进行双重条件判断实例对象,当两个线程同时调用该方法时无需再进行等待同步锁,也就说可以同时调用这个方法,
当都进入第一个条件判断时会碰到同步代码块synchronized (SingletonEntityThreadSafeDcl.class)只能有一个先进入执行，先进入的线程会碰到第二个判断，
如果为null才会进行实例化,当先进入的线程已经实例化对象后，后来的线程获得同步锁进入到第二个判断，此时singletonEntity这个实例已经
被第一个线程创建，所以后来的线程无需在进行new操作，跳出同步块获得第一个线程创建的实例，这样可以有效的提高多线程并发度，
因为单例创建一次对象后无需再次创建，所以这种写法既解决了
多线程同步等待，也解决了两个线程同时调用会创建多个对象的问题。
*/
public class SingletonEntityThreadSafeDcl {

    private static SingletonEntityThreadSafeDcl singletonEntity = null;

    private SingletonEntityThreadSafeDcl(){
    }

    public static synchronized SingletonEntityThreadSafeDcl getInstance(){
        if (singletonEntity==null){
            synchronized (SingletonEntityThreadSafeDcl.class){
                if(singletonEntity==null){
                    singletonEntity = new SingletonEntityThreadSafeDcl();
                }
            }
        }
        return singletonEntity;
    }
}
