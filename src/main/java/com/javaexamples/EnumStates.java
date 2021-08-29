package com.javaexamples;

import java.util.*;

enum States {
	
	ALABAMA("Alabama", "AL", false),
	ALASKA("Alaska", "AK", false),
	AMERICAN_SAMOA("American Samoa", "AS", false),
	ARIZONA("Arizona", "AZ", false),
	ARKANSAS("Arkansan", "AR", false),
	CALIFORNIA("California", "CA", false),
	COLORADO("Colorado","CO", false),
	CONNECTICUT("Connecticut","CT", true),
	DELAWARE("Delaware","DE", true),
	DISTRICT_OF_COLUMBIA("District Of Colombia","DC", false),
	FLORIDA("Florida","FL", false),
	GEORGIA("Georgia","GA", true),
	GUAM("Guam","GU", false),
	HAWAII("Hawaii","HI", false),
	IDAHO("Idaho","ID", false),
	ILLINOIS("Illinois","IL", false),
	INDIANA("Indiana","IN", false),
    IOWA("Iowa","IA", false),
    KANSAS("Kansas","KS", false),
    KENTUCKY("Kentucky","KY", false),
    LOUISIANA("Louiisiana","LA", false),
    MAINE("Maine","ME", false),
    MARYLAND("Maryland","MD", true),
    MASSACHUSETTS("Massachusetts","MA", true),
    MICHIGAN("Michigan","MI", false),
    MINNESOTA("Minnesota", "MN", false),
    MISSISSIPPI(" Mkssissippi","MS", false),
    MISSOURI("Missouri","MO", false),
    MONTANA("Montana","MT", false),
    NEBRASKA("Nebraska","NE", false),
    NEVADA("Nevada","NV", false),
    NEW_HAMPSHIRE("New Hampshire","NH", true),
    NEW_JERSEY("New Jersey", "NJ", true),
    NEW_MEXICO("New Mexico", "NM", false),
    NEW_YORK("New York", "NY", true),
    NORTH_CAROLINA("New Carolina", "NC", true),
    NORTH_DAKOTA("North Dakota", "ND", false),
    NORTHERN_MARIANA_IS("Northern Mariana Is","MP", false),
    OHIO("Ohio","OH", false),
    OKLAHOMA("Oklahoma","OK", false),
    OREGON("Oregon","OR", false),
    PENNSYLVANIA("Pennsylvania", "PA", true),
    PUERTO_RICO("Puerto Rico","PR", false),
    RHODE_ISLAND("Rhode Island","RI", true),
    SOUTH_CAROLINA("South Carolina","SC", true),
    SOUTH_DAKOTA("South Dakota","SD", false),
    TENNESSEE("Tennessee","TN", false),
    TEXAS("Texas","TX", false),
    UTAH("Utah","UT", false),
    VERMONT("Vermont","VT", false),
    VIRGINIA("Virginia","VA", true),
    VIRGIN_ISLANDS("Virgin Islands","VI", false),
    WASHINGTON("Washington","WA", false),
    WEST_VIRGINIA("West Virginia","WV", false),
    WISCONSIN("Wisconsin","WI", false),
    WYOMING("Wyoming","WY", false);
	
    private final String name;
    private final String abbr;
    private final boolean colony;
    
    private States(String name, String abbr, boolean colony) {
        this.name = name;
        this.abbr = abbr;
        this.colony = colony;
    }
    
    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

    public boolean isColony(){
        return colony;
    }
    
    public String toString() {
        return name + " " + abbr;
    }
	
};

public class EnumStates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(States.ALASKA);            // Prints "ALASKA"
		System.out.println(States.ALASKA.getName());  // Prints "Alaska"
		System.out.println(States.ALASKA.getAbbr());  // Prints "AK"
		System.out.println(States.ALASKA.isColony()); // Prints "false"
		
		System.out.println("-------------------------------------------");
		for (States s : States.values()) {
			System.out.println(s);  
		}
		
		System.out.println("-------------------------------------------");
		int count = 0;
		for (States s : States.values()) {
			if (s.isColony())
				count++;  
		}
		System.out.println("US states which was under British colony: " + count);
	}
}
