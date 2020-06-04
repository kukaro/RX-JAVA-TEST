package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Observable은 기본적으로 데이터를 발송할 때는 just를 사용해서 발송한다.
*/
public class P45_Observable_just {

    public static Logger log = LoggerFactory.getLogger(P45_Observable_just.class);

    public static void main(String[] args) {
        Observable<Integer> src = Observable.just(1, 2, 3, 4, 5, 6);
        src.subscribe(val -> log.info("" + val));
    }
}
