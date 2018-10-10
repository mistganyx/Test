package com.example.demo;

public class SingletonClass {
	private static SingletonClass instance= null;
	public static synchronized SingletonClass getInstance(){
		if(instance==null){
			instance=new SingletonClass();
		}
		return instance;
	}
	private SingletonClass(){}

}
	
