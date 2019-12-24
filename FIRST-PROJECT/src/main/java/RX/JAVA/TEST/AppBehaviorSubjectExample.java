package RX.JAVA.TEST;


import io.reactivex.subjects.BehaviorSubject;

public class AppBehaviorSubjectExample {
    public  void emit(){
        BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }

    public static void main(String[] args) {
        AppBehaviorSubjectExample demo = new AppBehaviorSubjectExample();
        demo.emit();
    }
}
