package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.reportes.builder;

public class Report {
    private String content = "";

    public void addSection(String section) {
        content += section + "\n";
    }

    public String getContent() {
        return content;
    }
}
