package com.techlab.composite.folder;

public class File implements IStorable {

	private String name;
	private double size;
	private String extension;
	StringBuilder sb = new StringBuilder();

	public File(String name, double size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	public String getName()  {
		return this.name;
	}

	public double getSize() {
		return this.size;
	}

	public String getExtension() {
		return this.extension;
	}
	@Override
	public void display(StringBuilder dashes) {
		// TODO Auto-generated method stub
		dashes.delete(dashes.indexOf("-"), dashes.length());
		dashes.append("-");
		System.out.println(dashes.toString() +  getName());
	}

}
