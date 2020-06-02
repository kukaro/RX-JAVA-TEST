package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

/*
Observable에서 fromArray를 사용해서 배열을 원소로 넣을 수 있다.
54장에서 보면 int[]를 어떻게 Integer[]로 바꿀 수 있는지를 알 수 있다.
*/
public class P53_Observable_fromArray {

    public static Logger log = LoggerFactory.getLogger(P53_Observable_fromArray.class);

    public static void main(String[] args) {
        Integer[] arr = {100, 200, 300};
        Observable<Integer> source = Observable.fromArray(arr);
        source.subscribe(val -> log.info("" + val));

        int[] iarr = {101, 202, 303};
        Observable<Integer> source2 = Observable.fromArray(IntStream.of(iarr).boxed().toArray(Integer[]::new));
        source2.subscribe(val -> log.info("" + val));
    }
}
