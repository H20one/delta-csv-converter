package be.h20one.delta.csv.converter.internal.coinbasePro;

import be.h20one.delta.csv.converter.api.coinbasePro.CoinbaseProCsv;

public class CoinbaseProCsvEntity implements CoinbaseProCsv {
    private String portfolio;
    private String tradeId;
    private String product;
    private String side;
    private String createdAt;
    private String size;
    private String sizeUnit;
    private String price;
    private String fee;
    private String total;
    private String priceFeeTotalUnit;

    public CoinbaseProCsvEntity() {

    }

    public CoinbaseProCsvEntity(String portfolio, String tradeId, String product, String side, String createdAt, String size, String sizeUnit, String price, String fee, String total, String priceFeeTotalUnit) {
        this.portfolio = portfolio;
        this.tradeId = tradeId;
        this.product = product;
        this.side = side;
        this.createdAt = createdAt;
        this.size = size;
        this.sizeUnit = sizeUnit;
        this.price = price;
        this.fee = fee;
        this.total = total;
        this.priceFeeTotalUnit = priceFeeTotalUnit;
    }

    @Override
    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    @Override
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    @Override
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    @Override
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String getPriceFeeTotalUnit() {
        return priceFeeTotalUnit;
    }

    public void setPriceFeeTotalUnit(String priceFeeTotalUnit) {
        this.priceFeeTotalUnit = priceFeeTotalUnit;
    }

    @Override
    public String toString() {
        return "CoinbaseProCsvEntity{" +
                "portfolio='" + portfolio + '\'' +
                ", tradeId='" + tradeId + '\'' +
                ", product='" + product + '\'' +
                ", side='" + side + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", size='" + size + '\'' +
                ", sizeUnit='" + sizeUnit + '\'' +
                ", price='" + price + '\'' +
                ", fee='" + fee + '\'' +
                ", total='" + total + '\'' +
                ", priceFeeTotalUnit='" + priceFeeTotalUnit + '\'' +
                '}';
    }
}
