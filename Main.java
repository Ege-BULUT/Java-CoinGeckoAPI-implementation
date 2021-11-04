package com.litesoftwares.coingecko;

import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class Main {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
        System.out.println(client.ping());



    }
}