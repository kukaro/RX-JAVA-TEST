package RX.JAVA.TEST;


import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class AppAsyncSubjectExample {
    public void emit() {
        Float[] temperature = {10.1f, 13.4f, 12.5f};
        Observable<Float> source = Observable.fromArray(temperature);

        AsyncSubject<Float> subject = AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));

        source.subscribe(subject);
    }

    public static void main(String[] args) {
        AppAsyncSubjectExample demo = new AppAsyncSubjectExample();
        demo.emit();
    }
}
