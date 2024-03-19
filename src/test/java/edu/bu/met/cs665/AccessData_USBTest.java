package edu.bu.met.cs665;

import junit.framework.TestCase;

public class AccessData_USBTest extends TestCase {

    public void testPrintCustomer() {
        AccessData_USB accessDataUSB = new AccessData_USB();
        int customerId = 12345;
        String expectedOutput = "Your customer id is: " + customerId;

        String printedOutput = accessDataUSB.printCustomer(customerId);

        assertEquals(expectedOutput, printedOutput);
    }

    public void testGetCustomer_USB() {
        AccessData_USB accessDataUSB = new AccessData_USB();
        int customerId = 12345;
        String expectedOutput = "Customer " + customerId + " : Retrieving your data via USB.";

        String retrievedOutput = accessDataUSB.getCustomer_USB(customerId);

        assertEquals(expectedOutput, retrievedOutput);
    }



}