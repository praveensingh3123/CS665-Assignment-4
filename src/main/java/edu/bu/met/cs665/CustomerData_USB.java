package edu.bu.met.cs665;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: CustomerData_UBS.java
 * Description: The CustomerData_USB interface defines methods for accessing customer data via USB.
 */
public interface CustomerData_USB {

    /**
     * This method is used to print customer id.
     */
    String printCustomer(int customerId);

    /**
     * This method is used to retrieve data via UBS.
     */
    String getCustomer_USB(int customerId);
}
