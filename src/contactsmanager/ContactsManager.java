/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmanager;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class ContactsManager {
    private Contact [] myFriends;
    private int friendsCount = 0;
    // Constructor
    ContactsManager() {
        myFriends = new Contact[500];
    }
    protected void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    public Contact searchContact(String searchName){
        Contact result = new Contact(null, null, null);
        for(int i = 0; i<friendsCount; i++){
            if(myFriends[i].getName().equals(searchName)){
                result.setName(myFriends[i].getName());
                result.setEmail(myFriends[i].getEmail());
                result.setPhoneNumber(myFriends[i].getPhoneNumber());
            }
        }
        return result;
    } 
}
