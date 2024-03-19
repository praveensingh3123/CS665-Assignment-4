/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import java.util.Scanner;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: Main.java
 * Description: This is the entry point of the Utilizing Legacy System. It offers a system to create different types
 * of users and send emails to them with a custom template.
 */

public class Main {

  /**
   * Main method which is the starting point of execution. Here customer data is retrieved using USB and HTTPS
   * request.
   */

  public static void main(String[] args) {

    //Create an instance of AccessData_USB to access customer data via USB
    CustomerData_USB accessCustomerData_USB = new AccessData_USB();

    //Prompt the user to enter their customer ID
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you customer ID: ");
    int customerId = sc.nextInt();

    String retrieveDataFromUSB = accessCustomerData_USB.getCustomer_USB(customerId);
    System.out.println(retrieveDataFromUSB);

    // Create an instance of AccessData_HTTPS to access customer data via HTTPS
    CustomerData_HTTPS accessCustomerData_HTTPS = new AccessData_HTTPS();

    // Create an instance of USBToHTTPDataAccessor to retrieve customer data via HTTPS using USB adapter
    CustomerData_USB myCustomer = new USBToHTTPDataAccessor(accessCustomerData_HTTPS);

    // Retrieve customer data using HTTPS via USB adapter
    String retrieveDataFromHTTPS = myCustomer.getCustomer_USB(customerId);
    System.out.println(retrieveDataFromHTTPS);
  }
}
