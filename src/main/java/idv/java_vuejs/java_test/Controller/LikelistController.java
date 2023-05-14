package idv.java_vuejs.java_test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.java_vuejs.java_test.Model.LikelistProduct;
import idv.java_vuejs.java_test.Model.like_list_service;

@RestController
@CrossOrigin
@RequestMapping("")
public class LikelistController {
    @Autowired
    private like_list_service likeListService;

    @GetMapping("/users/{customerId}")
    public List<LikelistProduct> getLikeListByCustomerId(@PathVariable int customerId) {
        return likeListService.getLikeListByCustomerId(customerId);
    }
}