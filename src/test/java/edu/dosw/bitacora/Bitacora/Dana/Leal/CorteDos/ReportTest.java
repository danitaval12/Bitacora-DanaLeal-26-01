package edu.dosw.bitacora.Bitacora.Dana.Leal.CorteDos;

import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder.*;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.decorator.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportTest {

    @Test
    void testReportBuilderAndDecorator() {

        ReportBuilder builder = new ConcreteReportBuilder();

        builder.addHeader();
        builder.addStatistics();
        builder.addTransactions();
        builder.addSummary();

        Report report = builder.getReport();

        DigitalSignatureDecorator decorated =
                new DigitalSignatureDecorator(report);

        String result = decorated.getContent();

        assertTrue(result.contains("Firma digital"));
    }
}