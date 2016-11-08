package biz.cosee.candyshop;

import biz.cosee.candyshop.api.dynamodbexample.LeaderBoardEntry;
import biz.cosee.candyshop.domain.Candy;
import biz.cosee.candyshop.domain.User;
import biz.cosee.candyshop.dynamodb.CalorieMeterEntry;
import biz.cosee.candyshop.dynamodb.CalorieMeterRepository;
import biz.cosee.candyshop.jpa.CandyRepository;
import biz.cosee.candyshop.jpa.FitnessRepository;
import biz.cosee.candyshop.jpa.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Service
@Slf4j
public class CandyShopService {

    //Autowired fields
    private final CandyRepository candyRepository;
    private final FitnessRepository fitnessRepository;
    private final UserRepository userRepository;
    private final CalorieMeterRepository calorieMeterRepository;

    @Autowired
    public CandyShopService(CandyRepository candyRepository, FitnessRepository fitnessRepository, UserRepository userRepository, CalorieMeterRepository calorieMeterRepository) {
        this.candyRepository = candyRepository;
        this.fitnessRepository = fitnessRepository;
        this.userRepository = userRepository;
        this.calorieMeterRepository = calorieMeterRepository;
    }


    public void demoMethod()  {
        
        log.info("end of demo method");
    }

    public void touch() {
        candyRepository.findByName("Mars");
        candyRepository.findByNameAndBrand("Mars", "Mars", new PageRequest(0,0));
        Iterator<Candy> candyIterator = candyRepository.findDistinctByBrand("Mars");
    }

    public void order(long candyId, long userId) {
        Candy orderedCandy = candyRepository.findById(candyId).orElseThrow(() -> new IllegalArgumentException("Illegal candy id"));
        User orderingUser = userRepository.findOne(userId);

        updateCalorieMeter(orderingUser, orderedCandy);
    }

    void updateCalorieMeter(User orderingUser, Candy orderedCandy) {
//        Optional<CalorieMeterEntry> optionalEntry = calorieMeterRepository.findByUserIdAndCandyId(orderingUser.getId(), orderedCandy.getId());
//
//        CalorieMeterEntry calorieMeterEntry;
//        if (optionalEntry.isPresent()) { //update existing entry
//            calorieMeterEntry = optionalEntry.get();
//            calorieMeterEntry.increaseCaloriesTotalBy(orderedCandy.getCalories());
//        }
//        else { //new entry needed
//            calorieMeterEntry = CalorieMeterEntry.builder()
//                    .userId(orderingUser.getId())
//                    .userName(orderingUser.getFullname())
//                    .candyId(orderedCandy.getId())
//                    .candyName(orderedCandy.getName())
//                    .caloriesTotal(orderedCandy.getCalories())
//                    .build();
//        }
//
//        calorieMeterRepository.save(calorieMeterEntry);
    }

    public List<CalorieMeterEntry> getCalorieMeter(long userId) {
        //return calorieMeterRepository.findByUserId(userId);
        return Collections.emptyList();
    }

    public List<LeaderBoardEntry> getCalorieLeaderboard() {
        Iterable<Candy> candies = candyRepository.findAll();
        List<LeaderBoardEntry> leaderboard = new ArrayList<>();
        candies.forEach(candy -> {
            Page<CalorieMeterEntry> firstPage = calorieMeterRepository.findByCandyIdSortByCaloriesTotalDesc(candy.getId(), new PageRequest(0, 1));
            List<CalorieMeterEntry> content = firstPage.getContent();
            if (content.size() > 0) {
                CalorieMeterEntry highestCalorieCount = content.get(0);
                leaderboard.add(LeaderBoardEntry.builder()
                        .candyName(candy.getName())
                        .username(highestCalorieCount.getUserName())
                        .totalCalories(highestCalorieCount.getCaloriesTotal())
                        .build());
            }
        });

        return leaderboard;
        //return Collections.emptyList();
    }
}
