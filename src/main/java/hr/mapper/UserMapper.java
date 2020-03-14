package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.User;
@Repository
public interface UserMapper {
	public boolean saveUser(User user);
	public List<User> selectAllUser();
	public User selectUserByUid(int uid);
	public boolean deleteUserByUid(int uid);
}
