package biz.cosee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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


}
