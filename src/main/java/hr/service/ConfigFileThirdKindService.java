package hr.service;

import java.util.List;

import hr.pojo.ConfigFileThirdKind;

public interface ConfigFileThirdKindService {
	public boolean saveConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public boolean removeConfigFileThirdKindById(int id);
	public boolean modifyConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public ConfigFileThirdKind queryConfigFileThirdKindById(int id);
	public List<ConfigFileThirdKind> queryConfigFileThirdKind();
	public int queryConfigFileThirdKindMaxId();
}
