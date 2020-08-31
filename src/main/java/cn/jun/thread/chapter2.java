package cn.jun.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: jun
 * @Date: 2020/8/27 10:12
 * @Version: 1.0
 * @Description: newFixedThreadPool 定长可重用线程池  提供sumbit、shutdown等api Callable<V> 返回 Future<V> get方法获取返回值
 */
public class chapter2 {

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Integer integer = 0;
        for (int i = 0; i < 100; i++){
            Future<Integer> results = fixedThreadPool.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return atomicInteger.incrementAndGet();
                }
            });

            try {
                 integer = results.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println(integer);
        fixedThreadPool.shutdown();
    }
}
