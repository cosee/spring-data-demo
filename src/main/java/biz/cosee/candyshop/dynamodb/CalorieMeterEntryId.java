package biz.cosee.candyshop.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CalorieMeterEntryId implements Serializable {
    @DynamoDBHashKey
    private long userId;
    @DynamoDBRangeKey
    private long candyId;
}