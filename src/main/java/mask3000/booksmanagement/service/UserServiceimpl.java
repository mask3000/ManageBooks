package mask3000.booksmanagement.service;

import mask3000.booksmanagement.dao.UserMapper;
import mask3000.booksmanagement.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public User checkUser(User user) {
        return userMapper.checkUser(user);
    }

    @Override
    public User checkManager(User user) {
        return userMapper.checkManager(user);
    }
}
