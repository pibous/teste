package lodging.service;

import lodging.data.Client;
import lodging.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client updateClient() {
        return null;
    }
}
