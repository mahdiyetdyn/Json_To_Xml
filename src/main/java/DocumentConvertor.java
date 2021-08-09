import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.List;

//singleton class
public class DocumentConvertor {
    private static DocumentConvertor documentConvertor = null;

    private DocumentConvertor() {
    }

    public static DocumentConvertor getDocumentConvertor() {
        if (documentConvertor == null)
            documentConvertor = new DocumentConvertor();
        return documentConvertor;
    }

    public List<Employee> jsonToObject(String content) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);

        List<Employee> listOfObject = objectMapper.readValue(content, new TypeReference<List<Employee>>() {
        });
        return listOfObject;
    }

    public String objectsToXml(List<Employee> employees) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        EmployeeData employeeData = new EmployeeData();
        employeeData.setEmployee(employees);

        String content = xmlMapper.writeValueAsString(employeeData);
        return content;
    }
}
