package com.techlab.ispsolution;

import com.techlab.ispviolation.IWorkable;

public class Manager implements IWorkable, IWork {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager stop work");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager start eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager stop eat");
	}

}
