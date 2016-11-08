package biz.cosee.candyshop.api.dynamodbexample;

import biz.cosee.candyshop.dynamodb.CalorieMeterEntry;
import lombok.Builder;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Builder
@Data
public class CalorieMeterResponse {
    private long userId;
    private String username;
    private Map<String, Long> candyToCalories;

    public static CalorieMeterResponse from(List<CalorieMeterEntry> allUserEntries) {
        if (allUserEntries.size() > 0) {
            CalorieMeterEntry calorieMeterEntry = allUserEntries.get(0);
            return CalorieMeterResponse.builder()
                    .userId(calorieMeterEntry.getUserId())
                    .username(calorieMeterEntry.getUserName())
                    .candyToCalories(allUserEntries.stream().collect(Collectors.toMap(CalorieMeterEntry::getCandyName, CalorieMeterEntry::getCaloriesTotal)))
                    .build();
        }
        else {
            throw new IllegalArgumentException("Entries must not be empty");
        }
    }

    public static CalorieMeterResponse emptyResponse() {
        return CalorieMeterResponse.builder()
                .userId(-1L)
                .username("")
                .candyToCalories(Collections.emptyMap())
                .build();
    }
}
