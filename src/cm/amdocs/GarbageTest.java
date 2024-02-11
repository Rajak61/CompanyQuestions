package cm.amdocs;

public class GarbageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GarbageTest g = new GarbageTest();
		g = null;
		System.gc();
		Thread.sleep(1000);

		System.out.println("end main");
	}

	@Override
	protected void finalize() {

		System.out.println("finalize method called");
		System.out.println(10 / 0);
	}
}
