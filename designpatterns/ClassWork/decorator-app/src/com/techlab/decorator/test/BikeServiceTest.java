package com.techlab.decorator.test;

import com.techlab.decorator.*;


public class BikeServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IBikeService service = new ChainAlignment(new OilChange(new BasicBikeService()));
		
		System.out.println(service.getdescription());
		System.out.println("Total Cost: " + service.getCost());
		
		System.out.println();
		IBikeService service1 = new ChainAlignment((new BasicBikeService()));
		
		System.out.println(service1.getdescription());
		System.out.println("Total Cost: " + service1.getCost());

	}

}
