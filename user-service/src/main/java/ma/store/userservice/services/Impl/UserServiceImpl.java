package ma.store.userservice.services.Impl;

import lombok.RequiredArgsConstructor;
import ma.store.userservice.mappers.Mapper;
import ma.store.userservice.models.dto.UserDto;
import ma.store.userservice.models.entities.User;
import ma.store.userservice.repositories.UserRepository;
import ma.store.userservice.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final Mapper<User, UserDto> mapper;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDto getUserByID(Long id) {
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
       UserDto userDto = mapper.mapFrom(user);
        return userDto;
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void addUser(User user) {
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);
    }

    @Override
    public long nbrUsers() {
        return userRepository.count();
    }
}
