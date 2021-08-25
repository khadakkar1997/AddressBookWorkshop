package AddressBookWorkshop;

import java.util.LinkedList;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.createContact();
        Contacts contact = addressBookService.createContact();
        LinkedList<Contacts> contactlist = addressBookService.addContacts(contact);
        System.out.println(contactlist);
    }
}
