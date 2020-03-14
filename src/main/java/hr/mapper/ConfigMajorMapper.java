package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigMajor;

@Repository
public interface ConfigMajorMapper {
	public boolean insertConfigMajor(ConfigMajor configmajor);
	public boolean deleteConfigMajorById(int id);
	public boolean updateConfigMajor(ConfigMajor configmajor);
	public ConfigMajor selectConfigMajorById(int id);
	public List<ConfigMajor> selectConfigMajor();
	public int selectConfigMajorMaxId();
}
