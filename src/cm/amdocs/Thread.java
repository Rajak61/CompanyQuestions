package cm.amdocs;

public class Thread extends Thread {

	public static void main(String[] args) {
		Thread t=new Thread();
		
		public void run(){
		synchronized(t){
			t.wait();
			t.notify();
			
		}
	}
}
