package kr.pku.designpattain;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kr on 2017/2/28.
 */
public class Singleton {
    /**
     * 创建实例的方法私有化，只有通过getInstance方法才能创建实例，
     * 该方法中保证了实例只能被创建一个
     */
    public  static int test;
    private Singleton(){
        System.out.println("实例化对象");
        test = 3;
    }

    /**
     * 生命一个锁，防止在多线程情况下创建多个实例
     */
    private final static Lock lock = new ReentrantLock();
    private static Singleton instance=null;

    /**
     *我们主要是在实例未创建之前进行加锁，创建实例之后就不需要加锁了，
     * 只需判断是否为空就可以，所以我在锁的外面再一次进行判断，当已存在
     * 该对象的实例时直接返回实例，这样只有第一次创建实例时候加锁，之后就不会
     * 再次加锁，时间效率会比一侧判断有所提高
     */
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            lock.lock();
            if(instance == null)
            {
                instance = new Singleton();
            }
            lock.unlock();
        }
        return instance;
    }

    /**
     * 通过静态函数构造，只调用一侧，但是会在代码编译时实例化，可能会实例化过早，或造成空间的浪费
     */
    private static Singleton instanceStatic=new Singleton();

    /**
     *  用到时在进行实例化
     */
    public static Singleton initInstance()
    {
        instance = new Singleton();
        return instance;
    }

    /**
     *多线程加锁，保证只有实例化一次
     */
    public static Singleton getInstance1()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }



    /**
     *单线程能保证实例化一次，多线程不能保证
     */
    public static Singleton getInstance2()
    {
        lock.lock();
        if(instance == null)
        {
            instance = new Singleton();
        }
        lock.unlock();
        return instance;
    }

    public static void main(String[] args)
    {
        System.out.println("singleTon test by kong !");
//        Singleton.getInstance4();
    }
}

//class Single
//{
//
//    static Single()
//    {
//
//    }
//
//}