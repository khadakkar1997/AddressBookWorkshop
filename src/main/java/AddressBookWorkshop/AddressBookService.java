package AddressBookWorkshop;

import java.util.Scanner;

public class AddressBookService {
    Scanner scanner = new Scanner(System.in);

    /**
     * Purpose : To take the user input for all the details.
     *
     * Here all the entered details are set to the contact details in Contacts class.
     */
    public void createContact() {
        Contacts contact = new Contacts();
        System.out.println("Enter first name : ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name : ");
        contact.setLastname(scanner.next());
        System.out.println("Enter address : ");
        contact.setAddress(scanner.next());
        System.out.println("Enter city : ");
        contact.setCity(scanner.next());
        System.out.println("Enter state : ");
        contact.setState(scanner.next());
        System.out.println("Enter zip : ");
        contact.setZip(scanner.nextLong());
        System.out.println("Enter phone number : ");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter Email :");
        contact.setEmail(scanner.next());
        scanner.close();

        System.out.println(contact);

    }

}
