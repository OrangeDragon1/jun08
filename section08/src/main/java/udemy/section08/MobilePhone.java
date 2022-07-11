package udemy.section08;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        int positionFound = findContact(contact);
        if (positionFound >= 0) {
            System.out.println("Contact already exist.");
            return false;
        }
        System.out.println("Contact was successfully added.");
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int positionFound = findContact(oldContact);
        if (positionFound < 0) {
            System.out.println("Contact doesn't exist.");
            return false;
        }
        this.myContacts.set(positionFound, newContact);
        System.out.println("Contact updated successfully.");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int positionFound = findContact(contact);
        if (positionFound == -1) {
            System.out.println("Contact doesn't exist.");
            return false;
        }
        this.myContacts.remove(positionFound);
        System.out.println("Contact removed successfully.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // private int findContact(Contact contact) {
    //     return findContact(contact.getName());
    // }

    private int findContact(String name) {
        System.out.println("Contact List: ");
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int positionFound = findContact(name);
        if (positionFound < 0) {
            System.out.println("Contact doesn't exist.");
            return null;
        }        
        return this.myContacts.get(positionFound);
    }

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s \n", (i + 1), myContacts.get(i).getName(),
                    myContacts.get(i).getPhoneNumber());
        }
    }

}
