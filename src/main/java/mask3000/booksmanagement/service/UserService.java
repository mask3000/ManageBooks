package mask3000.booksmanagement.service;

import mask3000.booksmanagement.pojo.User;


public interface UserService {
    User checkUser(User user);

    User checkManager(User user);
}
