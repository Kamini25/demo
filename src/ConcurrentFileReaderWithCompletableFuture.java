import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ConcurrentFileReaderWithCompletableFuture {
    public static void main(String[] args) {
         ConcurrentFileReaderWithCompletableFuture cr = new ConcurrentFileReaderWithCompletableFuture();
       String[] filePaths = new String[] {"src\\TextFilesFolder\\File1.txt", "src\\TextFilesFolder\\File1.txt", "src\\TextFilesFolder\\File1.txt"};
       cr.readFilesConcurrently(filePaths,2);
       
    }
    public void readFilesConcurrently(String[] filePaths, int threadPoolSize) {
     List<CompletableFuture<String>>  futureList = new ArrayList<>(); 
    for (String fileName : filePaths) {
        CompletableFuture<String> future = CompletableFuture
                                            .supplyAsync(() -> readFile(fileName))
                                            .exceptionally(ex ->{
                                                System.out.println("Error  " + ex.getMessage());
                                                return null;
                                            });
        futureList.add(future);
    }
   // This ensures your main thread waits for all file reads to finish.
    CompletableFuture<Void> allFutures = CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0]));
    allFutures.join();

    futureList.forEach((futureVal) -> {
        try{
            if(!futureVal.get().equals(null))
                System.out.println(futureVal.get());
        }
        catch(Exception e){
            System.out.println("Exception " + e.getMessage());
        }
    });
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
