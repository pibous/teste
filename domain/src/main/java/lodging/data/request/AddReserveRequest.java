package lodging.data.request;

import java.util.List;

public class AddReserveRequest {

    private long idClient;
    private List<Long> idSuite;
    private String dateInn;
    private String dateOut;

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

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public List<Long> getIdSuite() {
        return idSuite;
    }

    public void setIdSuite(List<Long> idSuite) {
        this.idSuite = idSuite;
    }
}
