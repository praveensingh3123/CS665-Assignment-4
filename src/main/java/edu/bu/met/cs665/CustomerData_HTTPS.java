package edu.bu.met.cs665;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: CustomerData_HTTPS.java
 * Description: The CustomerData_HTTPS interface defines methods for accessing customer data via HTTPS.
 */
public interface CustomerData_HTTPS {

    /**
     * This method is used to print customer id.
     */
    String printCustomer (int customerId);

    /**
     * This method is used to retrieve data via HTTPS request.
     */
    String getCustomer_HTTPS(int customerId);
}
