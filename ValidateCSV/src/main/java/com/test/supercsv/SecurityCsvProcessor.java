package com.test.supercsv;
import org.supercsv.cellprocessor.ift.CellProcessor;

import com.test.supercsv.customrule.SecurityIDCsvRule;
import com.test.supercsv.customrule.ISINCsvRule;
import com.test.supercsv.customrule.SecurityNameCsvRule;
import com.test.supercsv.customrule.CountryOfIssueISOCodeCsvRule;
import com.test.supercsv.customrule.CurrencyCodeCsvRule;
import com.test.supercsv.customrule.SecurityPriceCsvRule;
import com.test.supercsv.customrule.SecurityTypeIDCsvRule;
import com.test.supercsv.customrule.MarketStatusCsvRule;

/*"Security ID","ISIN","Security Name","Country of Issue ISO Code","Currency Code","Security Price","Security Type ID","Market Status"
"2336","NZKCSD0001L9","KIWI CAPITAL SECURITIES","NZ","NZD","75.6","1","ACTV"
"1*/
public class SecurityCsvProcessor implements CsvColumnProcessor {

    public CellProcessor[] getProcessors() {

        // @formatter:off
        return new CellProcessor[] {

                // Security ID
                new SecurityIDCsvRule(),

                // ISIN
                new ISINCsvRule(),

                // Security Name
                new SecurityNameCsvRule(),
                //
                // Country of Issue ISO Code
                new CountryOfIssueISOCodeCsvRule(),

                // Currency Code
                new CurrencyCodeCsvRule(),

                // Security Price
                new SecurityPriceCsvRule(),

                // Security Type ID
                new SecurityTypeIDCsvRule(),

                // Market Status
                new MarketStatusCsvRule(),

        };
    }

}
