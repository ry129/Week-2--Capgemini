package main.RideHailingApplication;

// Interface: GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}
