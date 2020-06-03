public class Test
{
	
	
 public static int a;
 
 
 public static  void doSomething()
 {
  Runnable runnable =
   new Runnable()
   {
    public void run()
    {
     
     a = a+1;
     System.out.println(a);
    }
   };
   
   runnable.run();
 }
 
 public static void main(String[] args) {
	 doSomething();
 }
 
 
}