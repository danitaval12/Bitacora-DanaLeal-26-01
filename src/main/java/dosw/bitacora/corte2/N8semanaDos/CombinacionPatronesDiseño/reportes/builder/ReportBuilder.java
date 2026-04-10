package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder;

public interface ReportBuilder {
    void addHeader();
    void addStatistics();
    void addTransactions();
    void addSummary();

    Report getReport();
}
