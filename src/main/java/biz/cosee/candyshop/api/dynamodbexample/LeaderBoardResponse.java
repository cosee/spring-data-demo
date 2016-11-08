package biz.cosee.candyshop.api.dynamodbexample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class LeaderBoardResponse {
    List<LeaderBoardEntry> leaderBoardEntries;
}
