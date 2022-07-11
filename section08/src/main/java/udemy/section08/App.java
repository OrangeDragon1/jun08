package udemy.section08;

public class App {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("9928-9834");
        Contact contact1 = Contact.createContact("Jisoo", "9983-3342");
        Contact contact2 = Contact.createContact("Rose", "8873-8842");
        boolean result1 = mobilePhone.addNewContact(contact1);
        System.out.println(result1);
        boolean result2 = mobilePhone.addNewContact(contact1);
        System.out.println(result2);
    }
}
