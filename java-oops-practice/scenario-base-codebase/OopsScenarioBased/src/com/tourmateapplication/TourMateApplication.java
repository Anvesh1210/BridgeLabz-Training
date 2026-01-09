package com.tourmateapplication;

public class TourMateApplication {
    public static void main(String[] args) {
    	//creating services
        Transport transport = new Transport(8000);
        Hotel hotel = new Hotel(12000);
        Activity activity = new Activity(5000);

        //domestic Trip
        Trip domesticTrip = new DomesticTrip("Goa", 5, transport, hotel, activity);

        domesticTrip.showTripDetails();
        domesticTrip.book();

        System.out.println();

        //international Trip
        Trip internationalTrip = new InternationalTrip("Paris", 7, transport, hotel, activity);

        internationalTrip.showTripDetails();
        internationalTrip.book();
    }
}
