package zzz_KeisankiNeo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> siki = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String add = scan.next();
		siki.add(add);
		
		System.out.println(siki.get(0));
	}

}
