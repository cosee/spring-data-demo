package biz.cosee.candyshop.api.dynamodbexample;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LeaderBoardEntry {
    private String candyName;
    private String username;
    private long totalCalories;
}
