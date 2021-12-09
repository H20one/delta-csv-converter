package be.h20one.delta.csv.converter.api.coinbasePro;

public interface CoinbaseProCsv {
    String getPortfolio();

    String getTradeId();

    String getProduct();

    String getSide();

    String getCreatedAt();

    String getSize();

    String getSizeUnit();

    String getPrice();

    String getFee();

    String getTotal();

    String getPriceFeeTotalUnit();
}
