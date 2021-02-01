package com.paymnet.roiim.model.paymenthandlerequest;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class CardDetail implements Serializable {
    private CardExpiry cardExpiry;
    private String cardNum;
    private String cvv;
    private String holderName;
    private String cardType;
    private String cardBin;
    private String lastDigits;
    private String cardCategory;

    public CardExpiry getCardExpiry() {
        return cardExpiry;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setCardExpiry(CardExpiry cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getLastDigits() {
        return lastDigits;
    }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public String getCardCategory() {
        return cardCategory;
    }

    public void setCardCategory(String cardCategory) {
        this.cardCategory = cardCategory;
    }

    @Override
    public String toString() {
        return "CardDetail{" +
                "cardExpiry=" + cardExpiry +
                ", cardNum='" + cardNum + '\'' +
                ", cvv='" + cvv + '\'' +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardBin='" + cardBin + '\'' +
                ", lastDigits='" + lastDigits + '\'' +
                ", cardCategory='" + cardCategory + '\'' +
                '}';
    }
}
