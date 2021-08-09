import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Employee {
    @JacksonXmlProperty(isAttribute = true)
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
    private String token;
    private String country;
    private String location;
    private Double lng;
    private Double lat;
    private String dob;
    private int gender;
    private int userType;
    private int userStatus;
    private String profilePicture;
    private String coverPicture;
    private boolean enablefollowme;
    private boolean sendmenotifications;
    private boolean sendTextmassage;
    private boolean enabletagging;
    private Date createdAt;
    private Date updatedAt;
    private Double livelng;
    private Double livelat;
    private String liveLocation;
    private int creditBalance;
    private int myCash;
}
