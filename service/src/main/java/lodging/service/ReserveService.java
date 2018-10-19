package lodging.service;

import lodging.data.Client;
import lodging.data.Reserve;
import lodging.data.Suite;
import lodging.data.request.AddReserveRequest;
import lodging.persistence.ClientRepository;
import lodging.persistence.ReserveRepository;
import lodging.persistence.SuiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private SuiteRepository suiteRepository;

    public Reserve createReserve(AddReserveRequest addReserveRequest) {
        Reserve reserve = new Reserve(addReserveRequest.getDateInn(), addReserveRequest.getDateOut());
        reserve.setClient(searchIdClient(addReserveRequest.getIdClient()));
        reserve.setSuites(addSuiteToReserve(addReserveRequest.getIdSuite()));
        return reserveRepository.save(reserve);
    }

    private List<Suite> addSuiteToReserve(List<Long> idSuites) {
        List<Suite> suites = new ArrayList<>();
        for (Long id : idSuites) {
            suites.add(searchIdSuite(id));
        }
        return suites;
    }

    private Suite searchIdSuite(Long id) {
        Suite suite = suiteRepository.findOne(id);
        return suite;
    }

    private Client searchIdClient(Long id) {
        Client client = clientRepository.findOne(id);
        return client;
    }
}