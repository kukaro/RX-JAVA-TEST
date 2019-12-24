package RX.JAVA.TEST;


import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class AppAsyncSubject {
    public  void emit(){
        AsyncSubject<String> subject = AsyncSubject.create();
        subject.subscribe(data->System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data->System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }

    public static void main(String[] args) {
        AppAsyncSubject demo = new AppAsyncSubject();
        demo.emit();
    }
}
