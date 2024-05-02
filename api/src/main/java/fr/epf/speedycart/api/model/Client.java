package fr.epf.speedycart.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Client {
    @Id
    private long clientId;
    private String firstname;
    private String lastname;
    private Date active_from;
    private Date deactive_from;
    private Date client_DOB;

    public Client() {
    }

    public Client(long clientId, String firstname, String lastname, Date active_from, Date deactive_from, Date client_DOB) {
        this.clientId = clientId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.active_from = active_from;
        this.deactive_from = deactive_from;
        this.client_DOB = client_DOB;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
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

    public Date getActive_from() {
        return active_from;
    }

    public void setActive_from(Date active_from) {
        this.active_from = active_from;
    }

    public Date getDeactive_from() {
        return deactive_from;
    }

    public void setDeactive_from(Date deactive_from) {
        this.deactive_from = deactive_from;
    }

    public Date getClient_DOB() {
        return client_DOB;
    }

    public void setClient_DOB(Date client_DOB) {
        this.client_DOB = client_DOB;
    }
}
