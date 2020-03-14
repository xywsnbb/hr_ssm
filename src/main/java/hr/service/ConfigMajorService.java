package hr.service;

import java.util.List;

import hr.pojo.ConfigMajor;

public interface ConfigMajorService {
	public boolean saveConfigMajor(ConfigMajor configmajor);
	public boolean removeConfigMajorById(int id);
	public boolean modifyConfigMajor(ConfigMajor configmajor);
	public ConfigMajor queryConfigMajorById(int id);
	public List<ConfigMajor> queryConfigMajor();
	public int queryConfigMajorMaxId();
}
