public class Daemon_test extends Thread
{

	public void run(){
if(Thread.currentThread().isDaemon())
{
System.out.println("daemon is called");
}
else
{
System.out.println("Thread is called");
}



}


public static void main(String args[]){
Daemon_test t1 = new Daemon_test();
Daemon_test t2 = new Daemon_test();
Daemon_test t3 = new Daemon_test();
t1.setDaemon(true) /now t1 is daemon thread 
t1.start(); //thread start
t2.start();
t3.start();


	}

}