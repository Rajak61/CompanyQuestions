package cm.amdocs;

public class Batman {
	int s = 81;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Batman().go();
	}

	void go() {

		incr(++s);
		System.out.println(s);
	}

	void incr(int s) {

		s += 10;

	}
}
