package lodging.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long idClient;
    private String name;
    private String cpf;

    @OneToMany(mappedBy = "client", targetEntity = Reserve.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Reserve> reserves;

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Client() {
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Reserve> getReserves() {
        return reserves;
    }

    public void setReserves(List<Reserve> reserves) {
        this.reserves = reserves;
    }
}
