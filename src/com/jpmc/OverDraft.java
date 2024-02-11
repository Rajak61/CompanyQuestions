package com.jpmc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class OverDraft {

	static int balance;// = 100;

	public static void main(String[] args) throws IOException {
		List<String>li=new ArrayList<>();
		 InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		    BufferedReader in = new BufferedReader(reader);
		    String line;
		    while ((line = in.readLine()) != null&& line.length()!= 0) {
		      li.add(line);
		    }
			List<String> s=li.subList(0, 1);
			
			List<String> s1=li.subList(1, li.size());
			
			balance=Integer.valueOf(s.get(0));
			for (String string : s1) {
				Withdraw(Double.valueOf(string));
			}
	}

	public static void Withdraw(double amount) {

		int Charge = 50; // overdraft charge
		if (balance - amount < 0) {

			if ((balance - Charge) - amount <= -300) { // If withdraw +
														// overdraft charge goes
														// over -300 then
														// overdraft limit has
														// been exceeded
				System.out
						.println("You have exceeded your Overdraft Limit, you will now be returned back to the menus");

			} else { // if not exceeding bank balance
				balance -= (amount + Charge); // subtract amount and charge from
												// balance
				System.out.println("You have withdrawen £" + amount);
				System.err.println("You now have a balance of £" + balance);
				System.out.println("/");
			}
		}
	}
}
