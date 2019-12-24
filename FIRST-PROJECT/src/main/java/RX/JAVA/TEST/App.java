package RX.JAVA.TEST;


import io.reactivex.Observable;

public class App {
    public  void emit(){
        //just는 발행하는 함수.
        Observable.just("Hello", "RxJava 2!!")
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        App demo = new App();
        demo.emit();
    }
}
