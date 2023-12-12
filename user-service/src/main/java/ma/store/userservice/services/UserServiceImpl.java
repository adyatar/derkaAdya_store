package ma.store.userservice.services;

import lombok.RequiredArgsConstructor;
import ma.store.userservice.models.entities.User;
import ma.store.userservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByID(Long id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
