package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileThirdKind;
@Repository
public interface ConfigFileThirdKindMapper {
	public boolean insertConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public boolean deleteConfigFileThirdKindById(int id);
	public boolean updateConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public ConfigFileThirdKind selectConfigFileThirdKindById(int id);
	public List<ConfigFileThirdKind> selectConfigFileThirdKind();
	public int selectConfigFileThirdKindMaxId();
}
