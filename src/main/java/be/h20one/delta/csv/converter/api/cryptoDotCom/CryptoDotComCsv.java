package be.h20one.delta.csv.converter.api.cryptoDotCom;

public interface CryptoDotComCsv {
    String getTimestampUTC();

    String getTransactionDescription();

    String getCurrency();

    String getAmount();

    String getToCurrency();

    String getToAmount();

    String getNativeCurrency();

    String getNativeAmount();

    String getNativeAmountInUsd();

    String getTransactionKind();
}
