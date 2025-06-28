public class ReflectionExample {
    public static void main(String[] args) {
        
    
        try {
            Class<?> clazz = Class.forName("Singleton_BillPughSolution");
            System.out.println("Class Name: " + clazz.getName());
            
            // Attempt to create an instance using reflection
            java.lang.reflect.Constructor<?> constructor = clazz.getDeclaredConstructor();
            
            constructor.setAccessible(true); // Bypass the private
            Object instance = constructor.newInstance();
            System.out.println("Instance created: " + instance);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("No such method: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Instantiation failed: " + e.getMessage());
        } catch (java.lang.reflect.InvocationTargetException e) {
            System.out.println("Invocation target exception: " + e.getMessage());
        }
    }
}
