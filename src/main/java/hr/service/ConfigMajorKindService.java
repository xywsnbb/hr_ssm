package hr.service;

import java.util.List;

import hr.pojo.ConfigMajorKind;

public interface ConfigMajorKindService {
	public boolean saveConfigMajorKind(ConfigMajorKind cmk);
	public boolean removeConfigMajorKind(int id);
	public boolean modifyConfigMajorKind(ConfigMajorKind cmk);
	public ConfigMajorKind queryConfigMajorKindById(int id);
	public List<ConfigMajorKind> queryConfigMajorKind();
	public int queryConfigMajorKindMaxId();
}
