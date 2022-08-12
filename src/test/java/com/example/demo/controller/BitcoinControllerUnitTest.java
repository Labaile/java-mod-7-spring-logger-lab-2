package com.example.demo.controller;

import com.example.demo.service.BitcoinService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BitcoinControllerUnitTest {
    /**
     * Test the controller to see if we are getting the correct response.
     */
    @Test
    void shouldReturnPrice(){
        BitcoinService bitcoinService = Mockito.mock(BitcoinService.class);
        String bitcoinPrice = "23000.00";
        BitcoinController bitcoinController = new BitcoinController(bitcoinService);
        when(bitcoinService.getBitcoinPrice()).thenReturn(bitcoinPrice);
        assertEquals(bitcoinPrice, bitcoinController.getBitcoinPrice(),
                "Controller returns the correct value");
    }

}