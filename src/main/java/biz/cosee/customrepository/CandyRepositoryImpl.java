package biz.cosee.customrepository;

import biz.cosee.Candy;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class CandyRepositoryImpl implements CandyRepositoryCustom {

    private final DataSource dataSource;

    public CandyRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void bulkPersist(List<Candy> candiesToInsert) {
        new JdbcTemplate(dataSource).batchUpdate(
                "INSERT INTO CANDY (name, brand, price, rating) VALUES (?, ?, ?, ?, ?)",
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        Candy candy = candiesToInsert.get(i);
                        ps.setString(1, candy.getName());
                        ps.setString(2, candy.getBrand());
                        ps.setInt(3, candy.getPrice());
                        ps.setInt(4, candy.getRating());
                    }

                    @Override
                    public int getBatchSize() {
                        return candiesToInsert.size();
                    }
                }
        );
    }


}
