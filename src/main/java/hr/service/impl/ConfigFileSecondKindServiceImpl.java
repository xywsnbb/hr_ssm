package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigFileSecondKindMapper;
import hr.pojo.ConfigFileSecondKind;
import hr.service.ConfigFileSecondKindService;

@Service
public class ConfigFileSecondKindServiceImpl implements ConfigFileSecondKindService{
	@Autowired
	private ConfigFileSecondKindMapper mapper = null;
	
	@Override
	public boolean saveConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind) {
		return mapper.insertConfigFileSecondKind(configFileSecondKind);
	}

	@Override
	public boolean removeConfigFileSecondKindById(int id) {
		return mapper.deleteConfigFileSecondKindById(id);
	}

	@Override
	public boolean modifyConfigFileThirdKind(ConfigFileSecondKind configFileSecondKind) {
		return mapper.updateConfigFileThirdKind(configFileSecondKind);
	}

	@Override
	public ConfigFileSecondKind queryConfigFileSecondKindById(int id) {
		return mapper.selectConfigFileSecondKindById(id);
	}

	@Override
	public List<ConfigFileSecondKind> queryConfigFileSecondKind() {
		return mapper.selectConfigFileSecondKind();
	}

	@Override
	public int queryConfigFileSecondKindMaxId() {
		return mapper.selectConfigFileSecondKindMaxId();
	}

}
