package hr.service;

import java.util.List;

import hr.pojo.User;

public interface UserService {
	public boolean addUser(User user);
	public List<User> queryAllUser();
	public User queryUserByUid(int uid);
	public boolean removeUserByUid(int uid);
}
