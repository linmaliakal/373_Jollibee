package model;

import java.util.ArrayList;

public class FacilityDetails extends Facility{
	int capacity = 20;
	int useInterval;
	ArrayList<String> FacilityDetails = new ArrayList();
	public FacilityDetails(int facilityId) {
		super(facilityId);
		// TODO Auto-generated constructor stub
	}

	public int isInUseDuringInterval() {
		//TODO this is the length of the interval of use
		int useInterval = 36;
		return useInterval;
	}
	
	public void calcProblemRateForFacility() {
		
	}
	
	public String addFacilityDetail() {
		//TODO ask user for input for the new detail
		String newDetail = "The New Detail";
		FacilityDetails.add(newDetail);
		return FacilityDetails;
	}
	
	public int requestAvailableCapacity() {
		//This is how many facilities are in the building
		int availableCapacity = 0;
		availableCapacity = (capacity - FacilityList.size());
		return availableCapacity;
	}
	
	public int calcDownTimeForFacility() {
		//TODO this is the downtime between leases
		int downTime = 6;
		return downTime;
	}
	
	public void getFacilityInformation() {
		//TODO add address and ID
		String facilityInfo = "Available Capacity: " + "";
	}
	
	public double calcUsageRate () {
		//TODO this is the monthly usage rate. Change these capacities
		double usageRate= 100 * ((capacity - requestAvailableCapacity())/capacity);
		return usageRate * useInterval;
	}
	
	
}