public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(3);

        // Submit tasks to the executor service
        for (int i = 0; i < 15; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Executing task " + taskId + " in thread " + Thread.currentThread().getName());
                try {
                    // Simulate some work with sleep
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Task " + taskId + " was interrupted");
                }
            });
        }

        // Shutdown the executor service gracefully
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                executorService.shutdownNow(); // Force shutdown if tasks are not finished
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}