package services;

import java.util.List;

import javax.ejb.Local;

import entities.User;

@Local
public interface UserManagementLocal {
	void addUser(User user);

	void updateUser(User user);

	void deleteUserById(Integer idUser);

	void deleteUser(User user);

	User findUserById(Integer idUser);

	List<User> findAllUsers();
}
