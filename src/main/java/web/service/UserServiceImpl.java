package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public void update(User user) {
    userDao.update(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
