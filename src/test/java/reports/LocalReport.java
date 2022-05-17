package reports;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LocalReport {

    public static void GenerateReport() {
        String path = Paths.get(LocalReportEnum.DOT.getDescripcion())
                .toAbsolutePath()
                .normalize()
                .toString() + LocalReportEnum.PATH_CUCUMBER.getDescripcion();
        File reportOutputDirectory = new File(path + LocalReportEnum.TARJET.getDescripcion());
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path + LocalReportEnum.NAME_REPORT.getDescripcion());

        Configuration configuration = new Configuration(reportOutputDirectory, LocalReportEnum.PROJECT_NAME.getDescripcion());

        configuration.setBuildNumber(LocalReportEnum.BUILD_NUMBER.getDescripcion());

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }

    public static void main(String[] arg) {
        LocalReport a = new LocalReport();
        a.GenerateReport();
    }
}
