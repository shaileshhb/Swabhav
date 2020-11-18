package com.techlab.decorator;

public class ChainAlignment extends BikeServices {
	
	private int alignmentCost = 100;
	
	public ChainAlignment(IBikeService bikeService) {
		super(bikeService);
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return bikeService.getdescription() + "\nChain Alignment done: " + alignmentCost;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return bikeService.getCost() + alignmentCost;
	}


}
