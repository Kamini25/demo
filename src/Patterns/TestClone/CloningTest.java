// // import java.util.HashMap;
// // import java.util.Map;

// // public class CloningTest {

// // 	public static void main(String[] args) throws CloneNotSupportedException {

// 	// 	Employee emp = new Employee();

// 	// 	emp.setId(1);
// 	// 	emp.setName("Pankaj");
// 	// 	Map<String, String> props = new HashMap<>();
// 	// 	props.put("salary", "10000");
// 	// 	props.put("city", "Bangalore");
// 	// 	emp.setProps(props);

// 	// 	Employee clonedEmp = (Employee) emp.clone();
//     //     // Check whether the emp and clonedEmp attributes are same or different
// 	// 	System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));
		
// 	// 	System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProps() == clonedEmp.getProps()));
		
// 	// 	// Let's see the effect of using default cloning
		
// 	// 	// change emp props
// 	// 	emp.getProps().put("title", "CEO");
// 	// 	emp.getProps().put("city", "New York");
// 	// 	System.out.println("clonedEmp props:" + clonedEmp.getProps());

// 	// 	// change emp name
// 	// 	emp.setName("new");
// 	// 	System.out.println("clonedEmp name:" + clonedEmp.getName());
//     // }
// //}


// // class MyThread extends Thread{
// // 	public void run(){
// // 		for (int i=0;i <10 ;i++ ) {
// // 			System.out.println("Child Thread");
// // 			// try{
// // 			// 	Thread.sleep(2000);
// // 			// }catch(InterruptedException e){}
// // 		}
// // 	}
// // }

// // class CloningTest{
// //   public static void main(String[] args) throws InterruptedException{
// //   	MyThread t  =  new  MyThread();
// //   	t.start();
// //   	//t.join();
// //   	//t.join(1000);
// //   	for (int i=0;i <10 ;i++ ) {
// // 		System.out.println("Main Thread");
// //         Thread.sleep(1000);
// // 	}
// //   }
// // }

// public class CloningTest {

//     // Starting counter
//       //will force all threads to update and use the latest copy of this counter, and not use locally cached copies
//     volatile static int counter = 1; 
    
//       int limit;

//     CloningTest (int limit) {this.limit = limit;}

//   //function to print odd numbers
//     public synchronized void printOddNum () {
//         while(counter<=limit) {
//             if(counter%2 == 1) { //counter is odd, print it
//                   // remove thread name and use System.out.print() to print in one line, as per the sample output format
//                 System.out.println(Thread.currentThread().getName()+": "+counter); 
//                 counter++;
//                 notifyAll();
//             } else {
//                 try {
//                     wait();
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//     }

//     // Function to print even numbers
//     public synchronized void printEvenNum () {
//         while (counter<=limit) {
//             if(counter%2 == 0) { //counter is even, print it
//               // remove thread name and use System.out.print() to print in one line, as per the sample output format
//                 System.out.println(Thread.currentThread().getName()+": "+counter);
//                 counter++;
//                 notifyAll();
//             } else {
//                 try {
//                     wait();
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//     }

//     // Driver Code
//     public static void main(String[] args) {
//         CloningTest printer = new CloningTest (10);

//         Thread t1 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 printer.printOddNum();
//             }
//         });
      
//         t1.setName("Odd"); // for clearer verification

//         Thread t2 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 printer.printEvenNum();
//             }
//         });
      
//         t2.setName("Even"); // for clearer verification

//         t1.start();
//         t2.start();
//     }
// }