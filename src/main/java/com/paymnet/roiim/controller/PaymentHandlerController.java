package com.paymnet.roiim.controller;

import com.paymnet.roiim.model.paymenthandlerequest.PaymentHandleRequest;
import com.paymnet.roiim.model.paymenthandleresponse.PaymentHandleResponse;
import com.paymnet.roiim.service.PaymentTokenService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/paymentHandleRequest")
public class PaymentHandlerController {

    @Autowired
    private PaymentTokenService paymentTokenService;

    @PostMapping(value="/",produces= MediaType.APPLICATION_JSON_VALUE)
    public PaymentHandleResponse getPaymentHandleResponse(@RequestBody PaymentHandleRequest paymentHandleRequest) {
      return  paymentTokenService.getPaymentHandleResponse(paymentHandleRequest);
    }
}
