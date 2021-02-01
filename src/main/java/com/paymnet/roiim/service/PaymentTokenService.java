package com.paymnet.roiim.service;

import com.paymnet.roiim.model.paymenthandlerequest.PaymentHandleRequest;
import com.paymnet.roiim.model.paymenthandleresponse.PaymentHandleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class PaymentTokenService {
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();

    String getUrl = "https://api.test.paysafe.com/paymenthub/v1/paymenthandles";

    public PaymentHandleResponse getPaymentHandleResponse(PaymentHandleRequest paymentHandleRequest) {
        System.out.println(paymentHandleRequest);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth("private-7751","B-qa2-0-5f031cdd-0-302d0214496be84732a01f690268d3b8eb72e5b8ccf94e2202150085913117f2e1a8531505ee8ccfc8e98df3cf1748");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        System.out.println(entity.toString());
        PaymentHandleResponse response= restTemplate.postForObject(getUrl,paymentHandleRequest, PaymentHandleResponse.class,entity,Map.class);

        return response;
    }
}
