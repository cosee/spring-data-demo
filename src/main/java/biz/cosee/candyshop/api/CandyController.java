package biz.cosee.candyshop.api;

import biz.cosee.candyshop.CandyShopService;
import biz.cosee.candyshop.api.dynamodbexample.CalorieMeterResponse;
import biz.cosee.candyshop.api.dynamodbexample.LeaderBoardResponse;
import biz.cosee.candyshop.api.dynamodbexample.OrderRequest;
import biz.cosee.candyshop.dynamodb.CalorieMeterEntry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/candyshop")
public class CandyController {

    private final CandyShopService candyShopService;


    public CandyController(CandyShopService candyShopService) {
        this.candyShopService = candyShopService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void callDemoMethod() {
        candyShopService.demoMethod();
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public void orderCandy(@RequestBody OrderRequest orderRequest) {
        candyShopService.order(orderRequest.getCandyId(), orderRequest.getUserId());
    }

    @RequestMapping(value = "/calorieMeter/{userId}", method = RequestMethod.GET)
    public CalorieMeterResponse getCalorieMeter(@PathVariable("userId") long userId) {
        List<CalorieMeterEntry> allUserEntries = candyShopService.getCalorieMeter(userId);
        if (allUserEntries.size() > 0) {
            return CalorieMeterResponse.from(allUserEntries);
        }
        else {
            return CalorieMeterResponse.emptyResponse();
        }
    }

    @RequestMapping(value = "/caloryLeaderBoard", method = RequestMethod.GET)
    public LeaderBoardResponse getCalorieLeaderboard() {
        return new LeaderBoardResponse(candyShopService.getCalorieLeaderboard());
    }


}
