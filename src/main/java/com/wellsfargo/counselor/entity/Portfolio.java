package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio{
    @Id
    private long portfolioId;
    private long clientId;
    private String securityDate;

    protected Portfolio{}

    public Portfolio(long clientId, String securityDate){
        this.clientId = clientId;
        this.securityDate = securityDate;
    }

    public long getId(){
        return portfolioId;
    }

    public void setId(long Id){
        portfolioId = Id;
    }

    public long getClientId(){
        return clientId;
    }
    
    public String getSecurityDate(){
        return securityDate;
    }


}