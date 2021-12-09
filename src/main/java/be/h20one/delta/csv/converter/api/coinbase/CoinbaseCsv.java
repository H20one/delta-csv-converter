package be.h20one.delta.csv.converter.api.coinbase;

public interface CoinbaseCsv {
    String getTimestamp();

    String getTransactionType();

    String getAsset();

    String getQuantityTransacted();

    String getSpotPriceCurrency();

    String getSpotPriceAtTransaction();

    String getSubtotal();

    String getTotal();

    String getFees();

    String getNotes();
}
