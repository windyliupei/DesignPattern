1. **SingletonEntity 只适合单线程环境（不好）**
2. **SingletonEntityThreadSafe 多线程的情况可以用。（懒汉式，不好）**
3. **SingletonEntityThreadSafeDcl 加同步锁时，前后两次判断实例是否存在**
4. **SingletonEntityHunger 饿汉式（建议使用）**
5. **SingletonEntityStaticClass 静态内部类。（建议使用）**