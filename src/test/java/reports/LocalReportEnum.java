package reports;

public enum LocalReportEnum {
    DOT("."),
    PATH_CUCUMBER("/build/reports/cucumber/"),
    TARJET("target"),
    NAME_REPORT("/report.json"),
    PROJECT_NAME("test"),
    BUILD_NUMBER("1");

    private final String descripcion;

    private LocalReportEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
