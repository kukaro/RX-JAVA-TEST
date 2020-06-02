package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Observable에서 fromIterable을 사용해서 Iterable 인터페이스들을 값으로 넣을 수 있다.
*/
public class P55_Observable_fromIterable {

    public static Logger log = LoggerFactory.getLogger(P55_Observable_fromIterable.class);

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jerry");
        names.add("William");
        names.add("Bob");
        Observable<String> source = Observable.fromIterable(names);
        source.subscribe(val -> log.info("" + val));

        List<String> names2 = Arrays.asList("Jerry2", "William2", "Bob2");
        Observable<String> source2 = Observable.fromIterable(names2);
        source2.subscribe(val -> log.info("" + val));
    }
}
