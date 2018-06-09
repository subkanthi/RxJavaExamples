import io.reactivex.Observable;

/**
 * Observable
 */
public class OberservableMain {
    public static void main(String[] args)  {
        Observable<String> myStrings =
                // .just creates an observable from any
                // type so it can be subscribed.
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");

        myStrings.subscribe(s -> System.out.println(s));
    }
}
