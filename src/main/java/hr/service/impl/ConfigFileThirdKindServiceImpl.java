package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigFileThirdKindMapper;
import hr.pojo.ConfigFileThirdKind;
import hr.service.ConfigFileThirdKindService;

@Service
public class ConfigFileThirdKindServiceImpl implements ConfigFileThirdKindService{
	@Autowired
	private ConfigFileThirdKindMapper mapper = null;
	
	@Override
	public boolean saveConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		return mapper.insertConfigFileThirdKind(configFileThirdKind);
	}

	@Override
	public boolean removeConfigFileThirdKindById(int id) {
		return mapper.deleteConfigFileThirdKindById(id);
	}

	@Override
	public boolean modifyConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		return mapper.updateConfigFileThirdKind(configFileThirdKind);
	}

	@Override
	public ConfigFileThirdKind queryConfigFileThirdKindById(int id) {
		return mapper.selectConfigFileThirdKindById(id);
	}

	@Override
	public List<ConfigFileThirdKind> queryConfigFileThirdKind() {
		return mapper.selectConfigFileThirdKind();
	}

	@Override
	public int queryConfigFileThirdKindMaxId() {
		return mapper.selectConfigFileThirdKindMaxId();
	}
	
}
