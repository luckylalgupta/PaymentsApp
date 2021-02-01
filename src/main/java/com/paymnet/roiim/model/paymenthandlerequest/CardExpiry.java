package com.paymnet.roiim.model.paymenthandlerequest;


import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
public class CardExpiry implements Serializable {
    Integer month;
    Integer year;

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CardExpiry{" +
                "month=" + month +
                ", year=" + year +
                '}';
    }
}
