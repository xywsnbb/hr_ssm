package hr.service;

import java.util.List;

import hr.pojo.ConfigFileSecondKind;

public interface ConfigFileSecondKindService {
	public boolean saveConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	public boolean removeConfigFileSecondKindById(int id);
	public boolean modifyConfigFileThirdKind(ConfigFileSecondKind configFileSecondKind);
	public ConfigFileSecondKind queryConfigFileSecondKindById(int id);
	public List<ConfigFileSecondKind> queryConfigFileSecondKind();
	public int queryConfigFileSecondKindMaxId();
}
