package RXJAVA2020.Chapter2;

import io.reactivex.Observable;
import io.reactivex.Single;

/*
 * Observable을 Single로 전환할 수 있다.
 */
public class P63_Single_ObservableToSingle {
    private static Logger log = Logger.getInstance();

    public static void main(String[] args) {

        Observable<String> source = Observable.just("Hello Single");
        Single.fromObservable(source).subscribe(log::info);
    }
}

