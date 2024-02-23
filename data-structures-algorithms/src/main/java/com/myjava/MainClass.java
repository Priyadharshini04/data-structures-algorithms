package com.myjava;

class SingleTon {
	private static volatile SingleTon singleTon; // obj
	private static volatile Integer lock = 10;

	public static SingleTon getInstance() {
		// t1,t2,t3
		if (singleTon == null) {
			synchronized (lock) {
				if (singleTon == null) {
					// takes 10 sec to execute.
					singleTon = new SingleTon(); // t4
				}
			}
		}
		return singleTon;
	}

	// takes 20 sec to execute.
	public static synchronized String getA() {
		return null;
	}
}

public class MainClass {
	public static void main(String[] args) {
		SingleTon.getA();
		// thread t1.
		SingleTon singleTon = SingleTon.getInstance();
		System.out.println(singleTon);
		System.out.println(SingleTon.getInstance());
		// thread t2.
		SingleTon singleTonOne = SingleTon.getInstance();

	}
}