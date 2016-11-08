package biz.cosee.candyshop.api.dynamodbexample;

import lombok.Data;

@Data
public class OrderRequest {
    private long userId;
    private long candyId;
}
