package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Observable에서 subscribe메소드를 호출하면 Disposable객체가 된다.
이 객체는 도중에 종료할 수 있다.
isDisposed는 해제됬는지를 물어본다. 당연히 true가 해지됬음을 의미한다.
*/
public class P47_Observable_Disposable {

    public static Logger log = LoggerFactory.getLogger(P47_Observable_Disposable.class);
    public static Disposable disposable;
    public static int num;

    public static void main(String[] args) {
        log.info("START");
        Observable<Integer> src = Observable.just(1, 2, 3, 4, 5, 6);
        new Thread(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("THREAD START");
            log.info("NUM:" + num);
        }).start();
        num = 10;
        disposable = src.subscribe(val -> {
            Thread.sleep(1000L);
            log.info("" + val);
        });
//        disposable.dispose();

        log.info("Disposable : " + disposable.isDisposed());
    }
}
