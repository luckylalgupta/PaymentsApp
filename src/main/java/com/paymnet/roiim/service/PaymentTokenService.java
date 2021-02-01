package com.paymnet.roiim.service;

import com.paymnet.roiim.model.paymenthandlerequest.PaymentHandleRequest;
import com.paymnet.roiim.model.paymenthandleresponse.PaymentHandleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentTokenService {
    RestTemplate restTemplate = new RestTemplate();


    public PaymentHandleResponse getPaymentHandleResponse(PaymentHandleRequest paymentHandleRequest) {


       // System.out.println(paymentHandleRequest);
        return null;
    }
}
