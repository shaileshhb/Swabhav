package com.techlab.composite.html.test;

import java.io.*;


import com.techlab.composite.html.*;

public class HtmlPageTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();

		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");
		ControlGroup p = new ControlGroup("p");

		html.addControl(body);
		body.addControl(div);
		div.addControl(p);
		p.addControl(new Control("input", "text", "FirstName"));
		p.addControl(new Control("br"));
		
		p.addControl(new Control("input", "password", "Password"));
		p.addControl(new Control("br"));
		
		p.addControl(new Control("input", "button", "Submit"));
		p.addControl(new Control("br"));

		sb = html.parseHtml();
		
		File file = new File("src/resource/htmlTest-1.html");

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(sb.toString());
		}

	}

}
	