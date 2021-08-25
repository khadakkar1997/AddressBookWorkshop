package AddressBookWorkshop;
import java.util.InputMismatchException;
import java.util.Scanner;



public class AddressBookService
{
    Contacts[] addressBook = new Contacts[20];
    private int index = 0;
    Scanner scanner = new Scanner(System.in);

    public Contacts createContact() throws CustomException
    {
        Contacts contact = new Contacts();
        return getDetails(contact);
    }

    private Contacts getDetails(Contacts contact) throws CustomException
    {
        try
        {
            System.out.println("Enter First Name ::");
            contact.setFirstName(scanner.next());
            System.out.println("Enter last Name ::");
            contact.setLastname(scanner.next());
            System.out.println("Enter address ::");
            contact.setAddress(scanner.next());
            System.out.println("Enter City ::");
            contact.setCity(scanner.next());
            System.out.println("Enter State ::");
            contact.setState(scanner.next());
            System.out.println("Enter Pincode ::");
            contact.setZip(scanner.next());
            System.out.println("Enter Phone Number ::");
            contact.setPhoneNumber(scanner.nextInt());
            System.out.println("Enter Email ::");
            contact.setEmail(scanner.next());
            return contact;
        } catch (InputMismatchException e)
        {
            throw new CustomException(CustomException.ExceptionsType.WRONG_INPUT, "Entered the wrong value");
        }
    }

    public Contacts[] addContacts(Contacts contact) throws CustomException
    {
        try
        {
            addressBook[index++] = contact;
            return addressBook;
        } catch (Exception e)
        {
            throw new CustomException(CustomException.ExceptionsType.NUll_VALUE, "Obtained value is null");
        }
    }

    public Contacts[] editContact(String name) throws CustomException
    {
        boolean is_found = false;
        if (addressBook.length == 0)
        {
            throw new CustomException(CustomException.ExceptionsType.EMPTY_LIST, "AddessBook is empty");
        } else
        {
            for (int contact = 0; contact < addressBook.length; contact++)
            {
                if (addressBook[contact] != null && addressBook[contact].getFirstName().equals(name))
                {
                    getDetails(addressBook[contact]);
                    is_found = true;
                    System.out.println("Contact Updated");
                }
            }
        }
        if (!is_found)
            contactNotPresent(is_found);
        return addressBook;
    }

    public Contacts[] deleteContact(String name)
    {
        boolean is_found = false;
        for (int conatct = 0; conatct < addressBook.length; conatct++)
        {
            if(addressBook[conatct] != null && addressBook[conatct].getFirstName().equals(name) )
            {
                is_found = true;
                for (int index=conatct; index < addressBook.length-2 ; index++)
                {
                    addressBook[index] = addressBook[index+1];
                }
                System.out.println("Contact deleted SuccessFully");
            }
        }
        contactNotPresent(is_found);
        return addressBook;
    }

    public void displayContacts()
    {
        if (addressBook != null)
        {
            for (int contact = 0; contact < addressBook.length; contact++)
            {
                if (addressBook[contact] != null)
                {
                    System.out.println(addressBook[contact]);
                }
            }
        } else
        {
            System.out.println("Contact list is empty");
        }
    }

    private void contactNotPresent(boolean is_found)
    {
        if (!is_found)
        {
            System.out.println("contact not found");
        }
    }
}
