package idv.java_vuejs.java_test.Model;
import idv.java_vuejs.java_test.Model.LikelistProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class like_list_service {

    @Autowired
    private LikeListDao likeListDao;

    public List<LikelistProduct> getLikeListByCustomerId(int customerId) {
        return likeListDao.getLikeListByCustomerId(customerId);
    }
}