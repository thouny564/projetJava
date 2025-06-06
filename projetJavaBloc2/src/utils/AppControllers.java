package utils;

import controller.*;

public class AppControllers {
    private final CountryController countryController;
    private final LocalityController localityController;
    private final HotelController hotelController;
    private final BedroomController bedroomController;
    private final BedroomOwnsAmenityController bedroomOwnsAmenityController;
    private final BedroomOwnsBedController bedroomOwnsBedController;
    private final ReservationController reservationController;
    private final CustomerController customerController;
    private final ReviewController reviewController;
    private final BedroomTypeController bedroomTypeController;

    public AppControllers() {
        countryController = new CountryController();
        localityController = new LocalityController();
        hotelController = new HotelController();
        bedroomController = new BedroomController();
        bedroomOwnsAmenityController = new BedroomOwnsAmenityController();
        bedroomOwnsBedController = new BedroomOwnsBedController();
        reservationController = new ReservationController();
        customerController = new CustomerController();
        reviewController = new ReviewController();
        bedroomTypeController = new BedroomTypeController();
    }

    public CountryController getCountryController() {
        return countryController;
    }

    public LocalityController getLocalityController() {
        return localityController;
    }

    public HotelController getHotelController() {
        return hotelController;
    }

    public BedroomController getBedroomController() {
        return bedroomController;
    }

    public BedroomOwnsAmenityController getBedroomOwnsAmenityController() {
        return bedroomOwnsAmenityController;
    }

    public BedroomOwnsBedController getBedroomOwnsBedController() {
        return bedroomOwnsBedController;
    }

    public ReservationController getReservationController() {
        return reservationController;
    }

    public CustomerController getCustomerController() {
        return customerController;
    }

    public ReviewController getReviewController() {
        return reviewController;
    }

    public BedroomTypeController getBedroomTypeController() {return bedroomTypeController;}



}
