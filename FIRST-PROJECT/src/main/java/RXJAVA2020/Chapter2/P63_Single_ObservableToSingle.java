package RXJAVA2020.Chapter2;

import io.reactivex.Observable;
import io.reactivex.Single;

/*
 * Observable을 Single로 전환할 수 있다.
 */
public class P63_Single_ObservableToSingle {
    private static Logger log = Logger.getInstance();

    public static void main(String[] args) {

        Single.fromObservable(Observable.just("Hello Single")).subscribe(log::info);

        Observable.just("Hello Single").single("defaultitem").subscribe(log::info);

        Observable.just("Hello Single").first("defaultitem").subscribe(log::info);

        Observable.empty().single("defaultitem").subscribe(log::info);

        Observable.just("Hello Single").take(1).single("defaultitem").subscribe(log::info);
    }
}

