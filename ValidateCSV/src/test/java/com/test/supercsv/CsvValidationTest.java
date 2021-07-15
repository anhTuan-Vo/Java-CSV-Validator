package com.test.supercsv;
import java.io.File;

import org.junit.Test;

public class CsvValidationTest {

    @Test
    public void test() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        CsvValidator.validateNewEmployee(new File(classLoader.getResource("test_local.csv").getFile()), new SecurityCsvProcessor().getProcessors());
    }

}
