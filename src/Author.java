import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Author temp = (Author) obj;
        return temp.firstName.equals(this.firstName) && temp.secondName.equals(this.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,secondName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName,secondName);
    }

}


