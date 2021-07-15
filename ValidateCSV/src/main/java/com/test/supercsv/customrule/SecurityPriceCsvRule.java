package com.test.supercsv.customrule;
import org.supercsv.cellprocessor.CellProcessorAdaptor;
import org.supercsv.exception.SuperCsvConstraintViolationException;
import org.supercsv.util.CsvContext;

public class SecurityPriceCsvRule extends CellProcessorAdaptor {

    @Override
    public <T> T execute(Object value, CsvContext context) {

        String regex = "[0-9.0-9]+";

        if (value instanceof String && !value.toString().matches(regex)) {
            throw new SuperCsvConstraintViolationException(String.format("mismatched format value '%s' encountered", value), context, this);
        }

        return next.execute(value, context);
    }

}
