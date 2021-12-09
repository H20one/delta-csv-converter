package be.h20one.delta.csv.converter.api.delta;

import be.h20one.delta.csv.converter.internal.delta.DeltaCsvEntity;
import be.h20one.delta.csv.converter.internal.uphold.UpholdCsvEntity;

public interface DeltaCsvEntityMapper {

    DeltaCsvEntity UpholdCsvEntityToDeltaCsvEntity(UpholdCsvEntity upholdCsvEntity);
}
