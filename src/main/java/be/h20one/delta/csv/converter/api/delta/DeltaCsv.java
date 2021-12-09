package be.h20one.delta.csv.converter.api.delta;

public interface DeltaCsv {
    String getDate();

    String getType();

    String getExchange();

    String getBaseAmount();

    String getBaseCurrency();

    String getQuoteAmount();

    String getQuoteCurrency();

    String getFee();

    String getFeeCurrency();

    String getCostsProceeds();

    String getCostsProceedsCurrency();

    String getSyncHoldings();

    String getSentReceivedFrom();

    String getSentTo();

    String getNotes();
}
