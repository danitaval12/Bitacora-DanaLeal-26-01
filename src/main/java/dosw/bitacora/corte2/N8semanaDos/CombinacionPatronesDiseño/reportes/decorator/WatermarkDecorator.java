package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.decorator;

import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder.Report;

public class WatermarkDecorator extends ReportDecorator {

    public WatermarkDecorator(Report report) {
        super(report);
    }

    public String getContent() {
        return report.getContent() + "Marca de agua\n";
    }
}
