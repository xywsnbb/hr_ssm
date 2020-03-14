package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigMajorKindMapper;
import hr.pojo.ConfigMajorKind;
import hr.service.ConfigMajorKindService;

@Service
public class ConfigMajorKindServiceImpl implements ConfigMajorKindService{
	@Autowired
	private ConfigMajorKindMapper mapper = null;

	@Override
	public boolean saveConfigMajorKind(ConfigMajorKind cmk) {
		return mapper.insertConfigMajorKind(cmk);
	}

	@Override
	public boolean removeConfigMajorKind(int id) {
		return mapper.deleteConfigMajorKind(id);
	}

	@Override
	public boolean modifyConfigMajorKind(ConfigMajorKind cmk) {
		return mapper.updateConfigMajorKind(cmk);
	}

	@Override
	public ConfigMajorKind queryConfigMajorKindById(int id) {
		return mapper.selectConfigMajorKindById(id);
	}

	@Override
	public List<ConfigMajorKind> queryConfigMajorKind() {
		return mapper.selectConfigMajorKind();
	}

	@Override
	public int queryConfigMajorKindMaxId() {
		int max = mapper.selectConfigMajorKindMaxId();
		return max;
	}
}
