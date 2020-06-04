package RXJAVA2020.Chapter2;

import io.reactivex.Single;

/*
 * 확인
 */
public class P62_Single_just {
    private static Logger log = Logger.getInstance();

    public static void main(String[] args) {
        Single<String> source = Single.just("Hello Single");
        source.subscribe(log::info);
    }
}

