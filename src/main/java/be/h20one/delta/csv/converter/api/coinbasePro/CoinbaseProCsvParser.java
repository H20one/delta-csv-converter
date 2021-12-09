package be.h20one.delta.csv.converter.api.coinbasePro;

public interface CoinbaseProCsvParser {
    void parseFromCsvToObject(String stringUrl);

    void parseFromObjectToCsv(CoinbaseProCsv coinbaseProCsv);
}
