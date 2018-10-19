package lodging.controller;

import lodging.data.Client;
import lodging.data.request.AddClientRequest;
import lodging.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all-client")
    public ResponseEntity<?> getClients() {
        return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add-client")
    public ResponseEntity<?> addClient(@RequestBody AddClientRequest addClientRequest) {
        Client client = new Client(addClientRequest.getName(), addClientRequest.getCpf());
        return new ResponseEntity<>(clientRepository.save(client), HttpStatus.OK);
    }

    @PutMapping("/update-client/{id}")
    public ResponseEntity<?> updateClient(@PathVariable Long id, @RequestBody AddClientRequest addClientRequest){
        Client client = clientRepository.findOne(id);
        return new ResponseEntity<>(clientRepository.save(editClient(client, addClientRequest)), HttpStatus.OK);
    }

    private Client editClient(Client client, AddClientRequest addClientRequest) {
        client.setName(addClientRequest.getName());
        client.setCpf(addClientRequest.getCpf());
        return client;
    }

    @DeleteMapping("/delete-client/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") Long id) {
        clientRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}