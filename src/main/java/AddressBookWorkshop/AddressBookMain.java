package AddressBookWorkshop;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to address book program");

        // Creating reference object for AddressBookServiceClass.
        AddressBookService addressBookService = new AddressBookService();

        // Calling create person method from AddressBookService class.
        addressBookService.createContact();
    }
}
