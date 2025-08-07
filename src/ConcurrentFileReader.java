/**
 * The {@code ConcurrentFileReader} class demonstrates how to read multiple files concurrently
 * using a fixed thread pool. It reads the contents of each file and prints them to the console.
 * <p>
 * Usage:
 * <ul>
 *   <li>Specify the file paths in the {@code filePaths} array.</li>
 *   <li>The files are read concurrently using a thread pool of size 2.</li>
 *   <li>The contents of each file are printed after reading.</li>
 * </ul>
 *
 * <p>
 * Example:
 * <pre>
 *   ConcurrentFileReader cr = new ConcurrentFileReader();
 *   String[] filePaths = {"file1.txt", "file2.txt"};
 *   // Files will be read concurrently
 * </pre>
 * </p>
 *
 * <p>
 * Note: This implementation uses {@link java.util.concurrent.ExecutorService} for concurrency
 * and {@link java.io.BufferedReader} for file reading.
 * </p>
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Main thread is blocked till file is read completely.
public class ConcurrentFileReader {
    public static void main(String[] args) {
       ConcurrentFileReader cr = new ConcurrentFileReader();
       String[] filePaths = new String[] {"src\\TextFilesFolder\\File1.txt", "src\\TextFilesFolder\\File1.txt", "src\\TextFilesFolder\\File1.txt"};
       cr.readFilesConcurrently(filePaths,2);
       System.out.println(Thread.currentThread().getName());
       System.out.println("Threads processing");
   }

   
/**
 * Reads multiple files concurrently and prints their contents.
 *
 * @param filePaths Array of file paths to read.
 * @param threadPoolSize Number of threads in the pool.
 */
public void readFilesConcurrently(String[] filePaths, int threadPoolSize) {
    ExecutorService threadPool = Executors.newFixedThreadPool(threadPoolSize);
    for (String fileName : filePaths) {
        threadPool.execute(() -> {
            String result = readFile(fileName);
            System.out.println("file read by " + Thread.currentThread().getName());
            System.out.println("fileName read " + fileName);
            System.out.println(result);
        });
    }
    threadPool.shutdown();
}
 
   
    public String readFile(String s){
        String line;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(s));
            while((line = br.readLine())!=null){
                sb.append(line).append("\n");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return sb.toString();
    }

}
