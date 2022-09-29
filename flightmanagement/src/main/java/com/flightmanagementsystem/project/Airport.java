package com.flightmanagementsystem.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport")

public class Airport {
	
	
	

	
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		private long airportCode;
		@Column(name="airportName")
		private String airportName;
		@Column(name="airportLocation")
		private String airportLocation;
		
		public Airport(long airportCode, String airportName, String airportLocation) {
			super();
			this.airportCode = airportCode;
			this.airportName = airportName;
			this.airportLocation = airportLocation;
		}
		
		public Airport() {
			super();
		}

		public long getAirportCode() {
			return airportCode;
		}
		public void setAirportCode(long airportCode) {
			this.airportCode = airportCode;
		}
		public String getAirportName() {
			return airportName;
		}
		public void setAirportName(String airportName) {
			this.airportName = airportName;
		}
		public String getAirportLocation() {
			return airportLocation;
		}
		public void setAirportLocation(String airportLocation) {
			this.airportLocation = airportLocation;
		}
		
	}







