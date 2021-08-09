import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConvertor {

    @Test
    public void testConvertJsonToObjects() throws IOException {
        DocumentConvertor convertor = DocumentConvertor.getDocumentConvertor();
        List<Employee> list = convertor.jsonToObject(createJsonFile());
        assertEquals(list.size(), 3);
        assertEquals(list.get(0).getId(), 1006);
        assertEquals(list.get(1).getAbout(), null);
        assertEquals(list.get(2).getToken(), "e269eeef-1de1-4438-885a-e30a9ad26106");
        assertEquals(list.get(1).isEnablefollowme(), false);

    }

    @Test
    public void testConvertObjectsToXml() throws IOException {
        DocumentConvertor convertor = DocumentConvertor.getDocumentConvertor();
        String stringXml = convertor.objectsToXml(createEmployees());
        String expected = "<EmployeeData>" +
                "<employees id=\"1000\">" +
                "<name>ali</name>" +
                "<email/>" +
                "<password/>" +
                "<about/>" +
                "<token/>" +
                "<country/>" +
                "<location/>" +
                "<lng>0</lng>" +
                "<lat>0</lat>" +
                "<dob/>" +
                "<gender>0</gender>" +
                "<userType>0</userType>" +
                "<userStatus>0</userStatus>" +
                "<profilePicture/>" +
                "<coverPicture/>" +
                "<enablefollowme>true</enablefollowme>" +
                "<sendmenotifications>false</sendmenotifications>" +
                "<sendTextmassage>false</sendTextmassage>" +
                "<enabletagging>false</enabletagging>" +
                "<createdAt/>" +
                "<updatedAt/>" +
                "<livelng/>" +
                "<livelat/>" +
                "<liveLocation/>" +
                "<creditBalance>0</creditBalance>" +
                "<myCash>0</myCash>" +
                "</employees>" +
                "<employees id=\"1\">" +
                "<name>sara</name>" +
                "<email/>" +
                "<password/>" +
                "<about/>" +
                "<token/>" +
                "<country/>" +
                "<location/>" +
                "<lng>0</lng>" +
                "<lat>0</lat>" +
                "<dob/>" +
                "<gender>0</gender>" +
                "<userType>0</userType>" +
                "<userStatus>0</userStatus>" +
                "<profilePicture/><coverPicture/>" +
                "<enablefollowme>false</enablefollowme>" +
                "<sendmenotifications>false</sendmenotifications>" +
                "<sendTextmassage>false</sendTextmassage>" +
                "<enabletagging>false</enabletagging>" +
                "<createdAt/><updatedAt/>" +
                "<livelng/><livelat/><liveLocation/>" +
                "<creditBalance>0</creditBalance>" +
                "<myCash>0</myCash>" +
                "</employees></EmployeeData>";

        assertEquals(expected, stringXml);
    }


    public String createJsonFile() throws IOException {
        String json = "[ " + "\n{" +
                "\"id\": 1006," +
                "\"name\": \"Test 4\"," +
                "\"email\": \"test1@test.com\"," +
                "\"about\": null," +
                "\"token\": \"f33f3325-bb08-41a5-b545-d2b5c443720f\"," +
                "\"enablefollowme\": false" +
                "}," + "\n{" +
                "\"id\": 4051," +
                "\"name\": \"manoj\"," +
                "\"email\": \"manoj@gmail.com\"," +
                "\"about\": null," +
                "\"token\": \"7f471974-ae46-4ac0-a882-1980c300c4d6\"," +
                "\"enablefollowme\": false" +
                "}," + "\n{" +
                "\"id\": 4050," +
                "\"name\": \"pankaj\"," +
                "\"email\": \"p1@gmail.com\"," +
                "\"about\": null," +
                "\"token\": \"e269eeef-1de1-4438-885a-e30a9ad26106\"," +
                "\"enablefollowme\": false" +
                "}" + "\n]";

        return json;
    }

    public List<Employee> createEmployees() {
        Employee employee1 = new Employee();
        employee1.setId(1000);
        employee1.setName("ali");
        employee1.setEnablefollowme(true);
        employee1.setAbout(null);

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setName("sara");
        employee2.setEnablefollowme(false);
        employee2.setAbout(null);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeList;
    }


}
