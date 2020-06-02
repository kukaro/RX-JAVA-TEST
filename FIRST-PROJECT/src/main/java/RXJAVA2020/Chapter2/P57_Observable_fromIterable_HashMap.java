package RXJAVA2020.Chapter2;


import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/*
Observable에서 fromIterable을 사용해서 Iterable 인터페이스들을 값으로 넣을 수 있다.
여기서 map을 사용하는 예제를 보자.
*/
public class P57_Observable_fromIterable_HashMap {

    public static Logger log = LoggerFactory.getLogger(P57_Observable_fromIterable_HashMap.class);

    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>() {
            {
                put("JAVA", "GOOD");
                put("C++", "SOSO");
                put("PYTHON", "BAD");
            }
        };
        Observable<String> source = Observable.fromIterable(m.keySet());
        source.subscribe(val -> log.info("key : " + val + ", value : " + m.get(val)));

    }
}
