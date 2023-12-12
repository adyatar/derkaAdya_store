package ma.store.userservice.web;


import lombok.RequiredArgsConstructor;
import ma.store.userservice.models.entities.User;
import ma.store.userservice.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
private final UserService userService;

@GetMapping("/users")
    public List<User> getAllUsers()
    {
      return   userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id)
    {
        return userService.getUserByID(id);
    }


}
