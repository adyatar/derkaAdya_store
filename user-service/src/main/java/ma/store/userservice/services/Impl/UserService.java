package ma.store.userservice.services.Impl;


import ma.store.userservice.models.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User getUserByID(Long id);

    void addUser(User user);



}
