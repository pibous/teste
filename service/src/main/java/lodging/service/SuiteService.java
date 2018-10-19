package lodging.service;

import lodging.data.Item;
import lodging.data.Suite;
import lodging.data.request.AddSuiteRequest;
import lodging.persistence.ItemRepository;
import lodging.persistence.SuiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SuiteService {

    @Autowired
    private SuiteRepository suiteRepository;
    @Autowired
    private ItemRepository itemRepository;

    public Suite createSuite(AddSuiteRequest addSuiteRequest) {
        Suite suite = new Suite(addSuiteRequest.getNameSuite(),
                addSuiteRequest.getTypeSuite(),
                addSuiteRequest.getNumberSuite());
        suite.setItems(addItemToSuite(addSuiteRequest.getIdItems()));
        return suiteRepository.save(suite);
    }

    private List<Item> addItemToSuite(List<Long> idItems) {
        List<Item> items = new ArrayList<>();
        for (Long id : idItems) {
            items.add(searchIdItem(id));
        }
        return items;
    }

    private Item searchIdItem(Long id) {
        Item item = itemRepository.findOne(id);
        return item;
    }
}
