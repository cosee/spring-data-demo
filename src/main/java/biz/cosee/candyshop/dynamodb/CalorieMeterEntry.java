package biz.cosee.candyshop.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamoDBTable(tableName = "CalorieMeter")
public class CalorieMeterEntry {

    @Id
    private CalorieMeterEntryId calorieMeterKey;

    @DynamoDBHashKey
    private long userId;
    private String userName;
    @DynamoDBRangeKey
    @DynamoDBIndexHashKey(globalSecondaryIndexName = "leaderboard_index")
    private long candyId;
    private String candyName;

    /** The sum of consumed calories by user for one candy. */
    @DynamoDBIndexRangeKey(globalSecondaryIndexName = "leaderboard_index")
    public long caloriesTotal;

    public long increaseCaloriesTotalBy(int calories) {
        return caloriesTotal += calories;
    }
}
