package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.decorator;

import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder.Report;

public abstract class ReportDecorator {

    protected Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    public abstract String getContent();
}
