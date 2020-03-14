package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileFirstKind;
@Repository
public interface ConfigFileFirstKindMapper {
	public boolean insertConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public boolean deleteConfigFileFirstKindById(int id);
	public boolean updateConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public ConfigFileFirstKind selectConfigFileFirstKindById(int id);
	public List<ConfigFileFirstKind> selectConfigFileFirstKind();
	public int selectConfigFileFirstKindMaxId();
}
