//thread extends
package thread;
public class mythread extends Thread{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		mythread mt = new  mythread();
  		mt.start();
 	}
}


//thread runnable interface
package thread;
public class myrunnable implements Runnable {
	public static int myCount = 0;
    public myrunnable(){
         
    }
    public void run() {
        while(myrunnable.myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++myrunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }}} 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        myrunnable mrt = new myrunnable();
        Thread t = new Thread(mrt);
        t.start();
        while(myrunnable.myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++myrunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }}
        System.out.println("End of Main Thread...");
    }}
