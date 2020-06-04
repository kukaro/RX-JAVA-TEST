package RXJAVA2020.Chapter2;

import io.reactivex.Single;

/*
 * Single은 Observable중에서 하나만 배포하는 observer다.
 */
public class P62_Single_just {
    private static Logger log = Logger.getInstance();

    public static void main(String[] args) {
        Single<String> source = Single.just("Hello Single");
        source.subscribe(log::info);
    }
}

