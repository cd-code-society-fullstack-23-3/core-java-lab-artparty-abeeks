package com.codedifferently.artparty;

public class Guest {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String reasonForVisit;

    public Guest(){

    }
    public Guest(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public Guest(Long id, String phone, String reasonForVisit){
        this.id = id;
        this.phone = phone;
        this.reasonForVisit = reasonForVisit;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getReasonForVisit(){
        return reasonForVisit;
    }
    public void setReasonForVisit(String reasonForVisit){
        this.reasonForVisit = reasonForVisit;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("ID: %d; Guest name: %s, %s; Guest email: %s", id, lastName, firstName, email));
        return builder.toString();
    }

}
