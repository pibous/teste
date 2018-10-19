package lodging.controller;

import lodging.data.Suite;
import lodging.data.request.AddSuiteRequest;
import lodging.persistence.SuiteRepository;
import lodging.service.SuiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suites")
public class SuiteController {

    @Autowired
    private SuiteRepository suiteRepository;
    @Autowired
    private SuiteService suiteService;

    @GetMapping("/all-suites")
    public ResponseEntity<?> getAllSuites() {
        return new ResponseEntity<>(suiteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add-suite")
    public ResponseEntity<?> addSuite(@RequestBody AddSuiteRequest addSuiteRequest) {
        suiteService.createSuite(addSuiteRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/update-suite/{id}")
    public ResponseEntity<?> updateSuite(@PathVariable Long id, @RequestBody AddSuiteRequest addSuiteRequest) {
        Suite suite = suiteRepository.findOne(id);
        return new ResponseEntity<>(suiteRepository.save(editSuite(suite, addSuiteRequest)), HttpStatus.OK);
    }

    private Suite editSuite(Suite suite, AddSuiteRequest addSuiteRequest) {
        suite.setNameSuite(addSuiteRequest.getNameSuite());
        suite.setTypeSuite(addSuiteRequest.getTypeSuite());
        suite.setNumberSuite(addSuiteRequest.getNumberSuite());
        return suite;
    }

    @DeleteMapping("/delete-suite/{id}")
    public ResponseEntity<?> deletSuite(@PathVariable Long id) {
        suiteRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
