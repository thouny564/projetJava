package business;

import dataAccess.CountryDBDAO;
import dataAccess.ICountryDataAccess;
import exceptions.GetAllCountryException;
import model.Country;

import java.util.ArrayList;

public class CountryManager {
    private ICountryDataAccess countryDBDAO;

    public CountryManager() {
        countryDBDAO = new CountryDBDAO();
    }


    public ArrayList<Country> getAllCountries() throws GetAllCountryException {
        return countryDBDAO.getAllCountries();
    }
}
