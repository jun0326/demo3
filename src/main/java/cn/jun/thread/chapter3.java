package cn.jun.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: jun
 * @Date: 2020/8/27 10:34
 * @Version: 1.0
 * @Description:
 */
public class chapter3 {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

//            scheduledExecutorService.schedule(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("延迟1秒执行");
//                }
//            },1, TimeUnit.SECONDS);



            scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println("延迟1秒后每3秒执行一次");
                }
            },1,3,TimeUnit.SECONDS);

    }
}
