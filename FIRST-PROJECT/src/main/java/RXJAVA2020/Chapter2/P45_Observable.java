package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class P45_Observable {

    public static Logger log = LoggerFactory.getLogger(P45_Observable.class);

    public static void main(String[] args) {
        Observable<Integer> src = Observable.just(1, 2, 3, 4, 5, 6);
        src.subscribe(val -> log.info("" + val));
    }
}
