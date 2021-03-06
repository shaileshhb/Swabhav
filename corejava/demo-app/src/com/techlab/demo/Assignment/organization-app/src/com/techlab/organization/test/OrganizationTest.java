package com.techlab.organization.test;

import java.util.ArrayList;
import java.util.LinkedList;

import com.techlab.organization.*;

public class OrganizationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList<Partner> partner = new LinkedList<Partner>();
		ArrayList<Talent> talent = new ArrayList<Talent>();
		
		Talent t1 = new Talent(101, "sam", 7.54, "Nexsales");
		Talent t2 = new Talent(102, "ben", 8.02, "AurionPro");
		Talent t3 = new Talent(103, "ram", 7.23, "Nexsales");
		Talent t4 = new Talent(104, "tom", 8.44, "Swabhav");
		Talent t5 = new Talent(105, "jon", 7.02, "AurionPro");
		
		talent.add(t1);
		talent.add(t2);
		talent.add(t3);
		talent.add(t4);
		talent.add(t5);
		
		Partner p1 = new Partner(1501, "AurionPro", 1000000.32, 120);
		Partner p2 = new Partner(1502, "Nexsales", 1200000.32, 150);
		
		p1.addTalent(t2);
		p1.addTalent(t5);
		
		p2.addTalent(t1);
		p2.addTalent(t3);
		
		partner.add(p1);
		partner.add(p2);
		
		Organization o = new Organization(2011, "Swabhav", "01/07/2019", partner);
		o.addTalent(t4);
		
		printOrganizationDetails(o);
		printPartnerDetails(partner);
//		printTalentInfo(talent);
	
	}

	public static void printOrganizationDetails(Organization o) {
		System.out.println(o);
	}
	
	public static void printPartnerDetails(LinkedList<Partner> partner) {
		for(Partner p: partner) {
			System.out.println(p);
		}
	}
	
	public static void printTalentInfo(ArrayList<Talent> talent) {
		System.out.println("Talents are:");
		for(Talent t: talent) {
			System.out.println(t);
		}
		
	}
	
}
