package com.litesoftwares.coingecko;

import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

import java.util.Map;

public class TestMain {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        Map<String, Map<String, Double>> bitcoin = client.getPrice("bitcoin",Currency.USD);
        double bitcoinPrice = bitcoin.get("bitcoin").get(Currency.USD);
        System.out.println("btc/usd: "+bitcoinPrice);

        bitcoin = client.getPrice("bitcoin",Currency.TRY);
        bitcoinPrice = bitcoin.get("bitcoin").get(Currency.TRY);
        System.out.println("btc/try: "+bitcoinPrice);

        Map<String, Map<String, Double>> slp = client.getPrice("smooth-love-potion",Currency.USD);
        double slpPrice = slp.get("smooth-love-potion").get(Currency.USD);
        System.out.println("\nslp/usd: "+slpPrice);

        slp = client.getPrice("smooth-love-potion",Currency.TRY);
        slpPrice = slp.get("smooth-love-potion").get(Currency.TRY);
        System.out.println("slp/try: "+slpPrice);

        Map<String, Map<String, Double>> axs = client.getPrice("axie-infinity",Currency.USD);
        double axsPrice = axs.get("axie-infinity").get(Currency.USD);
        System.out.println("\naxs/usd: "+axsPrice);

        axs = client.getPrice("axie-infinity",Currency.TRY);
        axsPrice = axs.get("axie-infinity").get(Currency.TRY);
        System.out.println("axs/try: "+axsPrice);
    }
}
