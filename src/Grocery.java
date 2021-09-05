import java.util.Objects;
import java.util.UUID;

public abstract class Grocery implements Energy {

    private String company;
    private UUID id;
    private String name;


    public Grocery(String company, String name, UUID id) {
        this.company = company;
        this.name = name;
        this.id = id;
    }

    public Grocery(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(company, grocery.company) && Objects.equals(name, grocery.name);
    }
}
