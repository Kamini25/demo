public class Singleton_DoubleLocking {
    private Singleton_DoubleLocking() {
        // private constructor to prevent instantiation
    }
    public static Singleton_DoubleLocking getInstance() {
        if (instance == null) {
            synchronized (Singleton_DoubleLocking.class) {
                if (instance == null) {
                    instance = new Singleton_DoubleLocking();
                }
            }
        }
        return instance;
    }
    private static Singleton_DoubleLocking instance;
    public void someMethod() {
        // method implementation
    }
    public static void main(String[] args) {
        Singleton_DoubleLocking singleton = Singleton_DoubleLocking.getInstance();
        System.out.println("Singleton instance created: " + singleton);
        System.out.println("Singleton instance created: " + singleton);
        System.out.println("Singleton instance created: " + singleton);

        singleton.someMethod();
    }
    

}