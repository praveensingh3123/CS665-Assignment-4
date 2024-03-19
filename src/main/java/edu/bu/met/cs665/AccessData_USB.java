package edu.bu.met.cs665;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: AccessData_USB.java
 * Description: This class implements the CustomerData_USB interface. It provides methods to print customer
 * information and retrieve customer data via USB.
 */
public class AccessData_USB implements CustomerData_USB{

    /**
     * This method is used to print Customer id.
     */
    @Override
    public String printCustomer(int customerId) {
        return "Your customer id is: " + customerId;
    }

    /**
     * This method is used to retrieve data via UBS.
     */
    @Override
    public String getCustomer_USB(int customerId) {
        return "Customer " + customerId + " : Retrieving your data via USB.";
    }
}
