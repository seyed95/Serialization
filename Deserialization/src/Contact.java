import java.io.Serializable;


public class Contact implements Serializable {
    long phoneNumber;
    transient String relationship;
    String designation="Intern";
    String name;
    private final long serialVersionUID=1l;


    //  private final long serialVersionUID=1l;

    public Contact(long phoneNumber, String relationship, String name) {
        this.phoneNumber = phoneNumber;
        this.relationship = relationship;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Contact" +
                "phoneNumber=" + phoneNumber +
                ", relationship='" + relationship + '\'' +
                ", name='" + name + '\''+"Designation="+designation;
    }
}
