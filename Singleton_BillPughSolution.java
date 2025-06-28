public class Singleton_BillPughSolution {
    private Singleton_BillPughSolution() {
        System.out.println("Singleton_BillPughSolution instance created");
        // private constructor to prevent instantiation
    }

    private static class DBHelper {
        private static final Singleton_BillPughSolution INSTANCE = new Singleton_BillPughSolution();
    }
    public static Singleton_BillPughSolution getInstance() {
        return DBHelper.INSTANCE;
        
    }
    public void someMethod() {
        // method implementation
    }

    public static void main(String[] args) {
        Singleton_BillPughSolution singleton = Singleton_BillPughSolution.getInstance();
        System.out.println("Singleton instance created: " + singleton);
        System.out.println("Singleton instance created: " + singleton);
        System.out.println("Singleton instance created: " + singleton);

        singleton.someMethod();
    }
}