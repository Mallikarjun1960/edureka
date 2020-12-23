package TreadConcepts;

public class Test {
 public static volatile int i=0;
	public static void main(String[] args) {
		Object monitor=new Object();
		Notifier notifier=new Notifier(monitor);
		Thread thread1=new Thread(notifier,"T1");
		Thread thread2=new Thread(notifier,"T2");
		Thread thread3=new Thread(notifier,"T3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
