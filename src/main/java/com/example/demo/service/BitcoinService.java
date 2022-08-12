package com.example.demo.service;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.List;
@Slf4j
@Service
public class BitcoinService {
    public String getBitcoinPrice(){
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();
        Bitcoin res = restTemplate.getForObject(apiURL, Bitcoin.class);
        log.info("The Price of Bitcoin is: {}", res.data.priceUsd);
        return res.data.priceUsd;
    }
}

class Bitcoin{
    public String timestamp;
    public Data data;
}
@Getter
@Setter
class Data {
    public String priceUsd;
    public String marketCapUsd;
    public String name;
}