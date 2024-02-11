package cm.amdocs;

public class Child extends Base {

	// public void run() throws Exception{

	// System.out.println("in child");
	// }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Child();
		} catch (Base e) {
			// TODO: handle exception
		} catch (Child e) {

		}
	}

}
