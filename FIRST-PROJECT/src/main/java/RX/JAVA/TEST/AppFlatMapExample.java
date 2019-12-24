package RX.JAVA.TEST;


import io.reactivex.Observable;
import io.reactivex.functions.Function;


public class AppFlatMapExample {
    public void emit() {
        Function<String, Observable<String>> getDoubleDiamonds = ball -> Observable.just(ball + "◇", ball + "◇");

        String[] balls = {"1","3","5"};
        Observable<String> source = Observable.fromArray(balls)
        .flatMap(getDoubleDiamonds);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        AppFlatMapExample demo = new AppFlatMapExample();
        demo.emit();
    }
}
