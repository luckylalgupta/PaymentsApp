package com.paymnet.roiim.model.paymenthandleresponse;

import com.paymnet.roiim.model.paymenthandlerequest.BillingDetail;
import com.paymnet.roiim.model.paymenthandlerequest.CardDetail;
import com.paymnet.roiim.model.paymenthandlerequest.ReturnLink;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class PaymentHandleResponse implements Serializable {
    private String id;
    private String paymentType;
    private String paymentHandleToken;
    private String merchantRefNum;
    private String currencyCode;
    private String txnTime;
    private BillingDetail billingDetails;
    private String customerIp;
    private String status;
    private Integer amount;
    private String action;
    private String usage;
    private String timeToLiveSeconds;
    private String transactionType;
    private String executionMode;
    private Boolean skip3ds;
    private ArrayList<ReturnLink> returnLinks;
    private CardDetail card;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentHandleToken() {
        return paymentHandleToken;
    }

    public void setPaymentHandleToken(String paymentHandleToken) {
        this.paymentHandleToken = paymentHandleToken;
    }

    public String getMerchantRefNum() {
        return merchantRefNum;
    }

    public void setMerchantRefNum(String merchantRefNum) {
        this.merchantRefNum = merchantRefNum;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public BillingDetail getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(BillingDetail billingDetails) {
        this.billingDetails = billingDetails;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getTimeToLiveSeconds() {
        return timeToLiveSeconds;
    }

    public void setTimeToLiveSeconds(String timeToLiveSeconds) {
        this.timeToLiveSeconds = timeToLiveSeconds;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    public Boolean getSkip3ds() {
        return skip3ds;
    }

    public void setSkip3ds(Boolean skip3ds) {
        this.skip3ds = skip3ds;
    }

    public ArrayList<ReturnLink> getReturnLinks() {
        return returnLinks;
    }

    public void setReturnLinks(ArrayList<ReturnLink> returnLinks) {
        this.returnLinks = returnLinks;
    }

    public CardDetail getCard() {
        return card;
    }

    public void setCard(CardDetail card) {
        this.card = card;
    }


}
