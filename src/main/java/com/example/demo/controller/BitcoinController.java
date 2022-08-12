package com.example.demo.controller;
import com.example.demo.service.BitcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/coingecko")
public class BitcoinController {
    @Autowired
    private BitcoinService bitcoinService;
    public BitcoinController(BitcoinService bitcoinService){
        this.bitcoinService = bitcoinService;
    }
    @GetMapping
    public String getBitcoinPrice(){
        log.trace("Start of getBitcoinPrice()");
        log.trace("End of getBitcoinPrice()");
        return bitcoinService.getBitcoinPrice();
    }
}
