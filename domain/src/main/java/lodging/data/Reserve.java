package lodging.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reserve {

    @Id
    @GeneratedValue
    private long idReserve;
    private String dateInn;
    private String dateOut;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "reserve_suite",
            joinColumns = { @JoinColumn(name = "fk_reserve") },
            inverseJoinColumns = { @JoinColumn(name = "fk_suite") }
    )
    private List<Suite> suites;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Reserve(String dateInn, String dateOut) {
        this.dateInn = dateInn;
        this.dateOut = dateOut;
    }

    public Reserve() {
    }

    public long getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(long idReserve) {
        this.idReserve = idReserve;
    }

    public String getDateInn() {
        return dateInn;
    }

    public void setDateInn(String dateInn) {
        this.dateInn = dateInn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Suite> getSuites() {
        return suites;
    }

    public void setSuites(List<Suite> suites) {
        this.suites = suites;
    }
}
