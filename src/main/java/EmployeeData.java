import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class EmployeeData {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Employee> employee;
}

