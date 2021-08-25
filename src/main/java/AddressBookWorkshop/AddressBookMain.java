package AddressBookWorkshop;

import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args) throws CustomException
    {
        Scanner scanner = new Scanner(System.in);
        AddressBookService addressBookService = new AddressBookService();
        System.out.println("Welcome to Address Book");
        while (true)
        {
            System.out.println("Enter what you have to do");
            System.out.println("" + " 1 Add Contact " + "\n 2 Edit Contact " + "\n 3 Display Contacts" + "\n 4 Delete"
                    + "\n 5 Exit" + "");

            int userChoice = scanner.nextInt();
            switch (userChoice)
            {
                case 1:
                    Contacts contact = addressBookService.createContact();
                    addressBookService.addContacts(contact);
                    break;

                case 2:
                    System.out.println("Enter a name of person of whom you waht to change data");
                    addressBookService.editContact(scanner.next());
                    break;

                case 3:
                    addressBookService.displayContacts();
                    break;

                case 4:
                    System.out.println("Enter a name of person of whom you want to delete conatct");
                    addressBookService.deleteContact(scanner.next());
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a proper value");
            }
        }
    }
}
© 2021 GitHub, Inc.
