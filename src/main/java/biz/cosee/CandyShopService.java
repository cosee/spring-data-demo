package biz.cosee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@Slf4j
public class CandyShopService {

    private final CandyRepository candyRepository;
    private final FitnessRepository fitnessRepository;
    private final UserRepository userRepository;

    @Autowired
    public CandyShopService(CandyRepository candyRepository, FitnessRepository fitnessRepository, UserRepository userRepository) {
        this.candyRepository = candyRepository;
        this.fitnessRepository = fitnessRepository;
        this.userRepository = userRepository;
    }


    public void demoMethod()  {
        
        Candy candy = new Candy();
        candyRepository.save(candy);

        try (Stream<Candy> mars = candyRepository.findByBrand("Mars")) {

        }

        //List<Candy> twix = candyRepository.findByName("Twix");

        log.info("end of demo method");
    }
}
