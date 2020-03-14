package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigFileFirstKindMapper;
import hr.pojo.ConfigFileFirstKind;
import hr.service.ConfigFileFirstKindService;

@Service
public class ConfigFileFirstKindServiceImpl implements ConfigFileFirstKindService{
	@Autowired
	private ConfigFileFirstKindMapper mapper = null;
	
	@Override
	public boolean saveConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		return mapper.insertConfigFileFirstKind(configFileFirstKind);
	}

	@Override
	public boolean removeConfigFileFirstKindById(int id) {
		return mapper.deleteConfigFileFirstKindById(id);
	}

	@Override
	public boolean modifyConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		return mapper.updateConfigFileFirstKind(configFileFirstKind);
	}

	@Override
	public ConfigFileFirstKind queryConfigFileFirstKindById(int id) {
		return mapper.selectConfigFileFirstKindById(id);
	}

	@Override
	public List<ConfigFileFirstKind> queryConfigFileFirstKind() {
		return mapper.selectConfigFileFirstKind();
	}

	@Override
	public int queryConfigFileFirstKindMaxId() {
		return mapper.selectConfigFileFirstKindMaxId();
	}

}
