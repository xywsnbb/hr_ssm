package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.UserMapper;
import hr.pojo.User;
import hr.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper = null;
	
	@Override
	public boolean addUser(User user) {
		return userMapper.saveUser(user);
	}

	@Override
	public List<User> queryAllUser() {
		return userMapper.selectAllUser();
	}

	@Override
	public User queryUserByUid(int uid) {
		return userMapper.selectUserByUid(uid);
	}

	@Override
	public boolean removeUserByUid(int uid) {
		return userMapper.deleteUserByUid(uid);
	}

}
