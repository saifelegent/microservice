package com.contact.entity;

public class Contact {


    public void setcId(long cId) {
        this.cId = cId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public long getcId() {
        return cId;
    }

    public String getEmail() {
        return email;
    }

    public String getContactName() {
        return ContactName;
    }

    public Contact(long cId, String email, String contactName) {
        this.cId = cId;
        this.email = email;
        ContactName = contactName;
    }

    private  long cId;
    private  String email;
     private String ContactName;


     private long userId (Long cId String email ,String contactName, Long userId) {


     }


}
