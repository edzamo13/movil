package com.fisa.yugiohapp.dto;

public class CardPrice{
    public String cardmarket_price;
    public String tcgplayer_price;
    public String ebay_price;
    public String amazon_price;
    public String coolstuffinc_price;

    public CardPrice() {
    }

    public CardPrice(String cardmarket_price, String tcgplayer_price, String ebay_price, String amazon_price, String coolstuffinc_price) {
        this.cardmarket_price = cardmarket_price;
        this.tcgplayer_price = tcgplayer_price;
        this.ebay_price = ebay_price;
        this.amazon_price = amazon_price;
        this.coolstuffinc_price = coolstuffinc_price;
    }

    public String getCardmarket_price() {
        return cardmarket_price;
    }

    public void setCardmarket_price(String cardmarket_price) {
        this.cardmarket_price = cardmarket_price;
    }

    public String getTcgplayer_price() {
        return tcgplayer_price;
    }

    public void setTcgplayer_price(String tcgplayer_price) {
        this.tcgplayer_price = tcgplayer_price;
    }

    public String getEbay_price() {
        return ebay_price;
    }

    public void setEbay_price(String ebay_price) {
        this.ebay_price = ebay_price;
    }

    public String getAmazon_price() {
        return amazon_price;
    }

    public void setAmazon_price(String amazon_price) {
        this.amazon_price = amazon_price;
    }

    public String getCoolstuffinc_price() {
        return coolstuffinc_price;
    }

    public void setCoolstuffinc_price(String coolstuffinc_price) {
        this.coolstuffinc_price = coolstuffinc_price;
    }
}
