package com.parkeaseapplication;

//Parking Slot class to allot parking Slot
public class ParkingSlot {
	//parking slot attributes
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String bookingLog;

    //constructor to initialize parking slot attributes
    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    //method to assign Vehicle
    public boolean assignVehicle(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            isOccupied = true;
            bookingLog = "Vehicle " + vehicle.getVehicleNumber() +
                         " parked in slot " + slotId;
            return true;
        }
        return false;
    }

    //method to release a Slot
    public void releaseSlot() {
        isOccupied = false;
    }
    
    //getter method get Booking log
    public String getBookingLog() {
        return bookingLog;
    }
    
    //method to check that slot is available or not
    public boolean isAvailable() {
        return !isOccupied;
    }
}
