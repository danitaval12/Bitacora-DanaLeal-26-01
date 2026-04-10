package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.decorator;

import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder.Report;

public class CompressionDecorator extends ReportDecorator {

    public CompressionDecorator(Report report) {
        super(report);
    }

    public String getContent() {
        return report.getContent() + "Archivo comprimido\n";
    }
}