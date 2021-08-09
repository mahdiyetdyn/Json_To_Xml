import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Demo {
    public static void main(String [] args) throws IOException {
        DocumentConvertor convertor = DocumentConvertor.getDocumentConvertor();
        String jsonString , xmlString;
        List<Employee> employeeList;

        jsonString = Files.readString(Paths.get("/home/mahdiye/EmployeeData.json"));
        employeeList = convertor.jsonToObject(jsonString);
        xmlString = convertor.objectsToXml(employeeList);

        Files.writeString(Paths.get("/home/mahdiye/output.xml") ,xmlString);
        System.out.println("mission done");
    }
}
