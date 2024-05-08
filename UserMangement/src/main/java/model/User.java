/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class User {
    	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String gender;
	private String nationality;
	private String resume; // This could be a file path or byte array in a real application
	private String address;
	private boolean notify;
	private boolean agree;

    public User(String firstname, String lastname, String password, String email, String gender, String nationality, String resume, String address, boolean notify, boolean agree) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.nationality = nationality;
        this.resume = resume;
        this.address = address;
        this.notify = notify;
        this.agree = agree;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }

    @Override
    public String toString() {
        return "UserModel{" + "firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", email=" + email + ", gender=" + gender + ", nationality=" + nationality + ", resume=" + resume + ", address=" + address + ", notify=" + notify + ", agree=" + agree + '}';
    }
        
    
}
