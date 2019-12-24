package RX.JAVA.TEST;


import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class AppAsyncSubjectExample2 {
    public void emit() {
        AsyncSubject<Integer> subject = AsyncSubject.create();
        subject.onNext(10);
        subject.onNext(11);
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext(12);
        subject.onComplete();
        subject.onNext(13);
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.subscribe(data -> System.out.println("Subscriber #3 => " + data));
    }

    public static void main(String[] args) {
        AppAsyncSubjectExample2 demo = new AppAsyncSubjectExample2();
        demo.emit();
    }
}
