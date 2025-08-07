import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class CompletableFuturesMethodDemo {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(()-> 10);
        CompletableFuture<Integer> f2  = CompletableFuture.supplyAsync(()-> 20);
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(f1,f2);
        allFutures.join();
       CompletableFuture<Void> f3 =  f1.thenAccept(res -> System.out.println(res));
       f3.join();

       CompletableFuture<Integer> f4 = f1.thenApply((res) -> res * 10)
                                        .thenCompose((val) -> CompletableFuture.supplyAsync(() -> val+3));

       f4.thenAccept(res -> System.out.println("Result after thenApply: " + res));
       f4.join();
       System.out.println(f1.join());
    Optional<String> op = Optional.of("kamini");


    }

    
}
