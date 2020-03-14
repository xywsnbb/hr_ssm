package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigMajorMapper;
import hr.pojo.ConfigMajor;
import hr.service.ConfigMajorService;

@Service
public class ConfigMajorServiceImpl implements ConfigMajorService{
	@Autowired
	private ConfigMajorMapper mapper = null;

	@Override
	public boolean saveConfigMajor(ConfigMajor configmajor) {
		return mapper.insertConfigMajor(configmajor);
	}

	@Override
	public boolean removeConfigMajorById(int id) {
		return mapper.deleteConfigMajorById(id);
	}

	@Override
	public boolean modifyConfigMajor(ConfigMajor configmajor) {
		return mapper.updateConfigMajor(configmajor);
	}

	@Override
	public ConfigMajor queryConfigMajorById(int id) {
		return mapper.selectConfigMajorById(id);
	}

	@Override
	public List<ConfigMajor> queryConfigMajor() {
		return mapper.selectConfigMajor();
	}

	@Override
	public int queryConfigMajorMaxId() {
		int max = mapper.selectConfigMajorMaxId();
		return max;
	}

}
