package RX.JAVA.TEST;


import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.subjects.AsyncSubject;

import java.util.concurrent.TimeUnit;

public class AppConnectableObservableExample {
    public void emit() throws InterruptedException {
        String[] dt = {"1", "3", "5"};
        Observable<String> balls = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(Long::intValue)
                .map(i -> dt[i])
                .take(dt.length);
        ConnectableObservable<String> source = balls.publish();
        source.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        source.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        source.connect();

        Thread.sleep(250);
        source.subscribe(data -> System.out.println("Subscriber #3 => " + data));
        Thread.sleep(100);
    }

    public static void main(String[] args) throws InterruptedException {
        AppConnectableObservableExample demo = new AppConnectableObservableExample();
        demo.emit();
    }
}
