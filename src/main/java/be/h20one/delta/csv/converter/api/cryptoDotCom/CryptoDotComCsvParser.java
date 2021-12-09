package be.h20one.delta.csv.converter.api.cryptoDotCom;

public interface CryptoDotComCsvParser {
    void parseFromCsvToObject(String stringUrl);

    void parseFromObjectToCsv(CryptoDotComCsv cryptoDotComCsv);
}
