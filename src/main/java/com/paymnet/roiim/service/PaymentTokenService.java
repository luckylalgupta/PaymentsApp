package com.paymnet.roiim.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paymnet.roiim.model.paymenthandlerequest.PaymentHandleRequest;
import com.paymnet.roiim.model.paymenthandleresponse.PaymentHandleResponse;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class PaymentTokenService {
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();

    String url = "https://api.test.paysafe.com/paymenthub/v1/paymenthandles";

    public ResponseEntity<String> getPaymentHandleResponse(PaymentHandleRequest paymentHandleRequest) {
        System.out.println(paymentHandleRequest);

        String plainCreds = "private-7751:B-qa2-0-5f031cdd-0-302d0214496be84732a01f690268d3b8eb72e5b8ccf94e2202150085913117f2e1a8531505ee8ccfc8e98df3cf1748";
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);

        headers.setContentType(MediaType.APPLICATION_JSON);
       // headers.add("Authorization", "Basic " + base64Creds);
        headers.add("Authorization", "Basic "+base64Creds);
        ObjectMapper mapper = new ObjectMapper();
        String payload = "";
        try {
            payload = mapper.writeValueAsString(paymentHandleRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        HttpEntity<String> request = new HttpEntity<String>(payload, headers);
        //ResponseEntity<PaymentHandleResponse> response= restTemplate.exchange(getUrl,HttpMethod.POST, request,PaymentHandleResponse.class,payload);
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        return response;
    }
}
