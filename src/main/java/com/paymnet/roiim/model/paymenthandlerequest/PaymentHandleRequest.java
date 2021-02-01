package com.paymnet.roiim.model.paymenthandlerequest;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class PaymentHandleRequest implements Serializable {

    private String merchantRefNum;
    private String transactionType;
    private String paymentType;
    private Integer amount;
    private String currencyCode;
    private String customerIp;
    private BillingDetail billingDetails;
    private CardDetail card;

    private ArrayList<ReturnLink> returnLinks;

    public String getMerchantRefNum() {
        return merchantRefNum;
    }

    public void setMerchantRefNum(String merchantRefNum) {
        this.merchantRefNum = merchantRefNum;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public BillingDetail getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(BillingDetail billingDetails) {
        this.billingDetails = billingDetails;
    }

    public CardDetail getCard() {
        return card;
    }

    public void setCard(CardDetail card) {
        this.card = card;
    }

    public ArrayList<ReturnLink> getReturnLinks() {
        return returnLinks;
    }

    public void setReturnLinks(ArrayList<ReturnLink> returnLinks) {
        this.returnLinks = returnLinks;
    }

    @Override
    public String toString() {
        return "PaymentHandleRequest{" +
                "merchantRefNum='" + merchantRefNum + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                ", currencyCode='" + currencyCode + '\'' +
                ", customerIp='" + customerIp + '\'' +
                ", billingDetails=" + billingDetails +
                ", card=" + card +
                ", returnLinks=" + returnLinks +
                '}';
    }
}
