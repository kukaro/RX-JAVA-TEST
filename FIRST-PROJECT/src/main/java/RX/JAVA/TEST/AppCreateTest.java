package RX.JAVA.TEST;


import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;

public class AppCreateTest {

    public void emit() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi1", "Hello1", "bye1", "bye3"));
        Observable.just(list, "daum")
                .subscribe(System.out::println);
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i <= 15; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("----------" + i + "초");
//                Thread.currentThread().getThreadGroup().list();
            }
        },"시간 새는 녀석").start();
        AppCreateTest demo = new AppCreateTest();
        demo.emit();
        MyRunnable myRunnable = new MyRunnable();

        new Thread(myRunnable,"런에이블").start();
        MyRunnable.makeString.subscribe((data) -> {
            System.out.println("**********Main");
            System.out.println(data);
        });
        for(int i=0;i<=15;i++){
            Thread.sleep(500);
            System.out.println("i");
        }
    }
}

class MyRunnable implements Runnable {
    private static int CNT = 6;
    public static Observable<String> makeString;

    public MyRunnable() {
        makeString = Observable.create((emitter) -> {
            for (int i = 0; i <= CNT; i++) {
                Thread.sleep(500);
                emitter.onNext("Hello" + i + "!");
            }
            emitter.onComplete();
        });
    }

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        makeString.subscribe((data) -> {
            System.out.println("**********Runnable");
            System.out.println(data);
        });
    }
}
