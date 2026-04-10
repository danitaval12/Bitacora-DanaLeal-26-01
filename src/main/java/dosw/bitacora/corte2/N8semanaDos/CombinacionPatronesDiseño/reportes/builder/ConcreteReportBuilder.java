package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder;

public class ConcreteReportBuilder implements ReportBuilder {

    private Report report = new Report();

    public void addHeader() {
        report.addSection("Información general");
    }

    public void addStatistics() {
        report.addSection("Estadísticas");
    }

    public void addTransactions() {
        report.addSection("Detalle de transacciones");
    }

    public void addSummary() {
        report.addSection("Resumen final");
    }

    public Report getReport() {
        return report;
    }
}