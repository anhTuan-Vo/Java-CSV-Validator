package com.test.supercsv;
import org.supercsv.cellprocessor.ift.CellProcessor;

public interface CsvColumnProcessor {
    CellProcessor[] getProcessors();
}
