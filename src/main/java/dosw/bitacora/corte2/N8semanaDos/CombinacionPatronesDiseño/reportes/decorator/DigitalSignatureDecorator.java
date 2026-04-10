package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.decorator;

import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder.Report;

public class DigitalSignatureDecorator extends ReportDecorator {

    public DigitalSignatureDecorator(Report report) {
        super(report);
    }

    public String getContent() {
        return report.getContent() + "Firma digital\n";
    }
}
