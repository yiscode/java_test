package idv.java_vuejs.java_test.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GetUserData{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public  GetUserData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getAllUsers() {
        String sql = "{call get_all_users()}";
        ResultSetExtractor<List<User>> rse = rs -> {
            List<User> result = new ArrayList<>();
            while (rs.next()) {
                User user = new User();
                user.setuser_id(rs.getLong("USER_ID"));
                user.setUser_name(rs.getString("User_name"));
                user.setEmail(rs.getString("Email"));
                result.add(user);
            }
            return result;
        };
        return jdbcTemplate.query(sql, rse);
    }
}