package com.patanjali;

public class SimpleFunInterfaceTest {
	  public static void main(String[] args) {
	    carryOutWork(new SimpleFuncInterface() {
	      @Override
	      public void doWork() {
	        System.out.println("Do work in SimpleFun impl...");
	        System.out.println("multiple");
	      }
	    });
	    carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
	  }
	  public static void carryOutWork(SimpleFuncInterface sfi){
	    sfi.doWork();
	  }
}