package PackagesDemo;

public class PackagesDemoMain {
    public String name;
    public String major;
    private String id;
    private String address;

    PackagesDemoMain(String name, String major, String id, String address){
        this.name = name;
        this.major = major;
        this.id = id;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }


}
