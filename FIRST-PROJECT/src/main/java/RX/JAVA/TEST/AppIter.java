package RX.JAVA.TEST;


import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;

public class AppIter {
    public  void emit(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi1","Hello1","bye1","bye3"));
        Observable.just(list,"daum")
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        AppIter demo = new AppIter();
        demo.emit();
    }
}
