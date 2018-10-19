package lodging.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Suite {

    @Id
    @GeneratedValue
    private long idSuite;
    private String nameSuite;
    private String typeSuite;
    private int numberSuite;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "suite_item",
            joinColumns = { @JoinColumn(name = "fk_suite") },
            inverseJoinColumns = { @JoinColumn(name = "fk_item") }
    )
    private List<Item> items;

    public Suite(String nameSuite, String typeSuite, int numberSuite) {
        this.nameSuite = nameSuite;
        this.typeSuite = typeSuite;
        this.numberSuite = numberSuite;
    }

    public Suite() {
    }

    public long getIdSuite() {
        return idSuite;
    }

    public void setIdSuite(long idSuite) {
        this.idSuite = idSuite;
    }

    public String getNameSuite() {
        return nameSuite;
    }

    public void setNameSuite(String nameSuite) {
        this.nameSuite = nameSuite;
    }

    public String getTypeSuite() {
        return typeSuite;
    }

    public void setTypeSuite(String typeSuite) {
        this.typeSuite = typeSuite;
    }

    public int getNumberSuite() {
        return numberSuite;
    }

    public void setNumberSuite(int numberSuite) {
        this.numberSuite = numberSuite;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
