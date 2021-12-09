package be.h20one.delta.csv.converter.api.delta;

import be.h20one.delta.csv.converter.internal.delta.DeltaCsvEntity;

import java.nio.file.Path;
import java.util.List;

public interface DeltaCsvParser {
    <T extends DeltaCsvEntity> void parseFromObjectToCsv(List<T> data, Class<T> beanClazz, Path of);

    void parseFromCsvToObject(String stringUrl);

//    void parseFromObjectToCsv(List<DeltaCsvEntity> deltaCsvEntityList, Path path);
}
