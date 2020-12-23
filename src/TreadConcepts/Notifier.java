package TreadConcepts;

public class Notifier implements Runnable {
	
	private Object monitor=null;
	private static int i=1;
	private static boolean first=true;
	private static boolean second=false;
	private static boolean  third=false;
	
	public Notifier(Object objcurr) {
		this.monitor=objcurr;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
			synchronized (monitor) {
				String Tname=Thread.currentThread().getName();
				if (first && Tname.equalsIgnoreCase("T1")){
					print();
					first=false;
					second=true;
					monitor.notifyAll();
					monitor.wait();
				}else  if(second && Tname.equalsIgnoreCase("T2")){
					print();
					second=false;
					third=true;
					monitor.notifyAll();
					monitor.wait();
					
				}else if(third && Tname.equalsIgnoreCase("T3")) {
					print();
					third=false;
					first=true;
					monitor.notifyAll();
					monitor.wait();
				}else {
					monitor.wait();
				}
				
			}
		
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	private void print() {
		System.err.println(Thread.currentThread().getName()+"--"+Notifier.i++);
	}

}
