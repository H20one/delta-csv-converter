package be.h20one.delta.csv.converter.exceptions;

public class FailedReadingFromCsvException extends RuntimeException {
    public FailedReadingFromCsvException(Throwable cause, String message) {
        super(message, cause);
    }
}

