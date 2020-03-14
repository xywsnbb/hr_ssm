package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigMajorKind;

@Repository
public interface ConfigMajorKindMapper {
	public boolean insertConfigMajorKind(ConfigMajorKind cmk);
	public boolean deleteConfigMajorKind(int id);
	public boolean updateConfigMajorKind(ConfigMajorKind cmk);
	public ConfigMajorKind selectConfigMajorKindById(int id);
	public List<ConfigMajorKind> selectConfigMajorKind();
	public int selectConfigMajorKindMaxId();
}
