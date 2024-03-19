package edu.bu.met.cs665;

import junit.framework.TestCase;

public class AccessData_HTTPSTest extends TestCase {

    public void testPrintCustomer() {
        AccessData_HTTPS accessDataHTTPS = new AccessData_HTTPS();
        int customerId = 12345;
        String expectedOutput = "Your customer id is: " + customerId;

        String printedOutput = accessDataHTTPS.printCustomer(customerId);

        assertEquals(expectedOutput, printedOutput);
    }

    public void testGetCustomer_HTTPS() {
        AccessData_HTTPS accessDataHTTPS = new AccessData_HTTPS();
        int customerId = 54321;
        String expectedOutput = "Customer " + customerId + " : Retrieving your data via HTTPS request.";

        String retrievedOutput = accessDataHTTPS.getCustomer_HTTPS(customerId);

        assertEquals(expectedOutput, retrievedOutput);
    }

}