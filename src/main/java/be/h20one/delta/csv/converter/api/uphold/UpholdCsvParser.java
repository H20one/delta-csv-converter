package be.h20one.delta.csv.converter.api.uphold;

import be.h20one.delta.csv.converter.internal.uphold.UpholdCsvEntity;

import java.util.List;

public interface UpholdCsvParser {
    List<UpholdCsvEntity> parseFromCsvToObject(String stringUrl);

    void parseFromObjectToCsv(UpholdCsv upholdCsv);
}
