package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void delete(int id);
    void add(User user);
    public User getById( int id);
    void update(User user);
    List<User> listUsers();
}
