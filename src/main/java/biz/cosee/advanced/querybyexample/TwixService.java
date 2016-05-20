package biz.cosee.advanced.querybyexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class TwixService {

    private final TwixRepository twixRepository;

    @Autowired
    public TwixService(TwixRepository twixRepository) {
        this.twixRepository = twixRepository;
    }

    public Iterable<Twix> doQueryForExample(Twix exampleTwix) {
        Iterable<Twix> all = twixRepository.findAll(Example.of(exampleTwix));
        return all;
    }

    public Iterable<Twix> doQueryForExampleSpecialMatcher(Twix exampleTwix) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnorePaths("name", "id").withIgnoreCase();
        Iterable<Twix> all = twixRepository.findAll(Example.of(exampleTwix, exampleMatcher));
        return all;
    }
}
