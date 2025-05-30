package dataAccess;

import exceptions.GetAllAmenitiesFromBedroomException;
import model.Amenity;

import java.util.ArrayList;

public interface IBedroomOwnsAmenityDataAccess {
    ArrayList<Amenity> getAllAmenitiesFromBedroom(int bedroomNumber, int hotelId) throws GetAllAmenitiesFromBedroomException;

}
