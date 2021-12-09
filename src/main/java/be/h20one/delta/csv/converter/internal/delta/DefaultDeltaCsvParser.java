package be.h20one.delta.csv.converter.internal.delta;

import be.h20one.delta.csv.converter.api.delta.DeltaCsvParser;
import be.h20one.delta.csv.converter.exceptions.FailedReadingFromCsvException;
import be.h20one.delta.csv.converter.internal.CustomMappingStrategy;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DefaultDeltaCsvParser implements DeltaCsvParser {

    @Override
    public void parseFromCsvToObject(String fileUrl) {
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(fileUrl))
                            .withSkipLines(1)
                            .build();

            List<DeltaCsvEntity> deltaCsvEntityList = reader.readAll().stream().map(data -> {
                DeltaCsvEntity deltaCsvEntity = new DeltaCsvEntity();
                deltaCsvEntity.setDate(data[0]);
                deltaCsvEntity.setType(data[1]);
                deltaCsvEntity.setExchange(data[2]);
                deltaCsvEntity.setBaseAmount(data[3]);
                deltaCsvEntity.setBaseCurrency(data[4]);
                deltaCsvEntity.setQuoteAmount(data[5]);
                deltaCsvEntity.setQuoteCurrency(data[6]);
                deltaCsvEntity.setFee(data[7]);
                deltaCsvEntity.setFeeCurrency(data[8]);
                deltaCsvEntity.setCostsProceeds(data[9]);
                deltaCsvEntity.setCostsProceedsCurrency(data[10]);
                deltaCsvEntity.setSyncHoldings(data[11]);
                deltaCsvEntity.setSentReceivedFrom(data[12]);
                deltaCsvEntity.setSentTo(data[13]);
                deltaCsvEntity.setNotes(data[14]);

                return deltaCsvEntity;
            }).collect(Collectors.toList());

            deltaCsvEntityList.forEach(deltaCsvEntity -> System.out.println(deltaCsvEntity.toString()));

        } catch (CsvException | IOException e) {
            throw new FailedReadingFromCsvException(e.getCause(), "Failed reading from Delta csv file. Exception thrown: " + e.getClass());
        }
    }

    @Override
    public <T extends DeltaCsvEntity> void parseFromObjectToCsv(List<T> data, Class<T> beanClazz, Path path) {
        CustomMappingStrategy<T> mappingStrategy = new CustomMappingStrategy<T>();
        mappingStrategy.setType(beanClazz);
        try {
            Writer writer = new FileWriter(path.toString());

            StatefulBeanToCsv<T> sbc = new StatefulBeanToCsvBuilder<T>(writer)
                    .withSeparator(',')
                    .withApplyQuotesToAll(false)
                    .withMappingStrategy(mappingStrategy)
                    .build();
            sbc.write(data);
            writer.close();

        } catch (CsvRequiredFieldEmptyException | CsvDataTypeMismatchException | IOException e) {
            e.printStackTrace();
        }
    }
}


