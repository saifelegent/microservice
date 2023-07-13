package com.contact;
import com.contact.entity.Contact;
import java.util.List;
public class ContactServiceImpl implements ContactService{

    //fake list of contact
     List<Contact> list = List.of(
             new Contact(1L,"raju@gmail.com","Saif Ali",1327l),
             new Contact(1L,"raju@gmail.com","Saif Ali",1327l),

             );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return null;
    }

    }
