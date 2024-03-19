package edu.bu.met.cs665;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: AccessData_HTTPS.java
 * Description: This class implements the CustomerData_HTTPS interface. It provides methods to print customer
 * information and retrieve customer data via HTTPS request.
 */
public class AccessData_HTTPS implements CustomerData_HTTPS{

    /**
     * This method is used to print customer id.
     */
    @Override
    public String printCustomer(int customerId) {
        return "Your customer id is: " + customerId;
    }

    /**
     * This method is used to retrieve data via HTTPS request.
     */

    @Override
    public String getCustomer_HTTPS(int customerId) {
        return "Customer " + customerId + " : Retrieving your data via HTTPS request.";
    }
}
