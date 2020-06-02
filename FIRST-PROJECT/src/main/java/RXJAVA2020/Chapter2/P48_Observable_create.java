package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Observable에서 create를 사용해서 아주 상세하게 만들 수 있다.
create를 만들 때는 observable에 등록된 콜백을 모두 해제해야한다고함. 이는 조심해봐야할듯
배압을 직접처리해야한다고함. 이책의 8장에 등장한다고한다.
*/
public class P48_Observable_create {

    public static Logger log = LoggerFactory.getLogger(P48_Observable_create.class);

    public static void main(String[] args) {
        Observable<Integer> source = Observable.create(emitter -> {
            emitter.onNext(100);
            emitter.onNext(200);
            emitter.onNext(300);
            emitter.onComplete();
        });
        source.subscribe(val -> log.info("" + val));
    }
}
