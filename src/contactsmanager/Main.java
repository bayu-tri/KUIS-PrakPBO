/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmanager;

import java.util.Scanner;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ContactsManager myContactsManager = new ContactsManager();
        Contact zahra = new Contact("Zahra Dilani Febriana", "zahra2001@gmail.com", "0895414387040");
        myContactsManager.addContact(zahra);
        Contact dedi = new Contact("Dedi Mumtazul Umam", "dedi.mumtaz@gmail.com", "085671234124");
        myContactsManager.addContact(dedi);
        Contact rara = new Contact("Rara Lidya", "rara.cans@gmail.com", "0812344543234");
        myContactsManager.addContact(rara);
        Contact anna = new Contact("Anna Amanda", "anna@gmail.com", "081245547567");
        myContactsManager.addContact(anna);
        Contact farrel = new Contact("Farrel Arkan", "farrel.gans@gmail.com", "0867567575");
        myContactsManager.addContact(farrel);
        
        String isAgain = "y";
        String searchName;
        while("y".equals(isAgain)){
            System.out.print("Search Name : ");
            searchName = input.nextLine();
            System.out.println("Searching....");
            if(myContactsManager.searchContact(searchName).getName() == null){
                System.out.println(searchName +"'s Contact Not Found!");
            }
            else{
                System.out.println("Name     : "+myContactsManager.searchContact(searchName).getName());
                System.out.println("Number   : "+myContactsManager.searchContact(searchName).getPhoneNumber());
                System.out.println("Email    : "+myContactsManager.searchContact(searchName).getEmail());
            }
            System.out.print("\nAgain? (y/n) : ");
            isAgain = input.nextLine();
        }
    }
    
}
