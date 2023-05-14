package idv.java_vuejs.java_test.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LikeListDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<LikelistProduct> getLikeListByCustomerId(int customerId) {
        return jdbcTemplate.query("CALL getLikeListByCustomerId(?)", new Object[]{customerId}, new LikeListMapper());
    }

    private static final class LikeListMapper implements ResultSetExtractor<List<LikelistProduct>> {
        public List<LikelistProduct> extractData(ResultSet rs) throws SQLException {
            List<LikelistProduct> list = new ArrayList<>();
            while (rs.next()) {
                LikelistProduct likeListProduct = new LikelistProduct();
                like_list likeList = new like_list();
                Product product = new Product();

                likeList.setSn(rs.getLong("SN"));
                likeList.setOrder_name(rs.getString("order_name"));
                likeList.setAccount(rs.getString("account"));
                likeList.setTotal_fee(rs.getLong("total_fee"));
                likeList.setTotal_amount(rs.getLong("total_amount"));
                likeList.setproduct_id(rs.getLong("product_id"));
                likeList.setcustomer_id(rs.getLong("customer_id"));

                product.setNO(rs.getLong("NO"));
                product.setPrice(rs.getLong("Price"));
                product.setFee_rate(rs.getLong("Fee_rate"));
                product.setProductname(rs.getString("Productname"));

                likeListProduct.setLikeList(likeList);
                likeListProduct.setProduct(product);

                list.add(likeListProduct);
            }
            return list.isEmpty() ? null : list;
        }
    }
}
