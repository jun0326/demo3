package cn.jun.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: jun
 * @Date: 2020/8/27 10:10
 * @Version: 1.0
 * @Description: newCachedThreadPool 缓存型线程池  Runnable 接口
 */
public class chapter1 {
    public static void main(String[] args) {



        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "线程在执行###");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private static class TestThread{
        public static void main(String[] args) {
            System.out.println("--------------");
            new Thread(){
                @Override
                public void run(){
                    Thread.yield(); //调用该方法使当前线程让出cpu，并重新回到可执行状态。
                    System.out.println("testThread1.....");
                }
            }.start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("testThread2.....");
                }
            },"2").start();
        }
    }
}
