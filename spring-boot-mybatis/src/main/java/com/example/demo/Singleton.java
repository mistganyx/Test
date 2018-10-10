package com.example.demo;

public class Singleton {
	private static final Singleton instance =new Singleton();
    private Singleton(){
//do something
}
//这里提供了一个供外部访问本class的静态方法，可以直接访问
	public static Singleton getInstance(){
		return instance;
		}


}
