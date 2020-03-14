package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileSecondKind;
@Repository
public interface ConfigFileSecondKindMapper {
	public boolean insertConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	public boolean deleteConfigFileSecondKindById(int id);
	public boolean updateConfigFileThirdKind(ConfigFileSecondKind configFileSecondKind);
	public ConfigFileSecondKind selectConfigFileSecondKindById(int id);
	public List<ConfigFileSecondKind> selectConfigFileSecondKind();
	public int selectConfigFileSecondKindMaxId();
}
