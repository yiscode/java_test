package idv.java_vuejs.java_test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.java_vuejs.java_test.Model.User;
import idv.java_vuejs.java_test.Model.GetUserData;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {

    @Autowired
    private GetUserData getUserData;

    @GetMapping
    public List<User> getAllUsers() {
        return getUserData.getAllUsers();
    }
}