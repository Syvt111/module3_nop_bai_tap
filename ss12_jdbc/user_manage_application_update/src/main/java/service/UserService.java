package service;

import model.User;
import repository.IUserRepository;

import java.sql.SQLDataException;
import java.util.List;

public class UserService implements IUserService{
    IUserRepository iUserRepository = new repository.UserService();
    @Override
    public void insertUser(User user) throws SQLDataException {
        iUserRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return iUserRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return iUserRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLDataException {
        return iUserRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLDataException {
        return iUserRepository.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return iUserRepository.searchByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        return iUserRepository.sortByName();
    }
}
