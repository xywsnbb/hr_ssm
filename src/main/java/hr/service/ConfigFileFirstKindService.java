package hr.service;

import java.util.List;

import hr.pojo.ConfigFileFirstKind;

public interface ConfigFileFirstKindService {
	public boolean saveConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public boolean removeConfigFileFirstKindById(int id);
	public boolean modifyConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public ConfigFileFirstKind queryConfigFileFirstKindById(int id);
	public List<ConfigFileFirstKind> queryConfigFileFirstKind();
	public int queryConfigFileFirstKindMaxId();
}
