package cn.jun.thread;


import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: jun
 * @Date: 2020/8/27 11:35
 * @Version: 1.0
 * @Description:
 */
public class chapter4 {

    public static void main(String[] args) {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 100; i++){
            final int index = i;
            singleThreadExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "正在被执行，打印的值是" + index);
            });
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

//        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

//        for (int i = 0; i < 100; i++){
//            final int index = i;
//            fixedThreadPool.execute(() -> {
//                System.out.println(Thread.currentThread().getName() + "正在被执行，打印的值是" + index);
//            });
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
