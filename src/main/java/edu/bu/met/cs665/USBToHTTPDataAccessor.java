package edu.bu.met.cs665;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: USBToHTTPDataAccessor.java
 * Description: This class implements the CustomerData_USB interface. It acts as an adapter between USB-based
 * customer data access and HTTPS-based customer data access.
 */
public class USBToHTTPDataAccessor implements CustomerData_USB{
    private CustomerData_HTTPS accessData_https;

    public USBToHTTPDataAccessor(CustomerData_HTTPS accessData_https){
        this.accessData_https = accessData_https;
    }
    @Override
    public String printCustomer(int customerId) {
        return "Your customer id is: " + customerId;
    }
    @Override
    public String getCustomer_USB(int customerId) {
        return accessData_https.getCustomer_HTTPS(customerId);
    }
}
