package com.windy.dp.Singleton;


/*饱汉模式(懒汉模式)--线程安全*/

/*
优点：同 SingletonEntity，但加锁了。
缺点：synchronized 为独占排他锁，并发性能差。即使在创建成功以后，获取实例仍然是串行化操作。
*/
public class SingletonEntityThreadSafe {

    private static SingletonEntityThreadSafe singletonEntity = null;

    private SingletonEntityThreadSafe(){
    }

    public static synchronized SingletonEntityThreadSafe getInstance(){
        if (singletonEntity==null){
            singletonEntity = new SingletonEntityThreadSafe();
        }
        return singletonEntity;
    }
}
