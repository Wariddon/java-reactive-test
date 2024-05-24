package test;

import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public class Mono {

    public static Consumer<Integer> onNext() {
        return System.out::println;
    }

    public static Consumer<Throwable> onError() {
        return System.out::println;
    }

    public static Runnable onComplete() {
        return () -> System.out.println("completed");
    }

    public static void main(String[] args) throws InterruptedException {
        Flux<Integer> flux = Flux.just(1,2,3,4,5);
        flux.subscribe(
                onNext(),
                onError(),
                onComplete()
        );
    }

}
