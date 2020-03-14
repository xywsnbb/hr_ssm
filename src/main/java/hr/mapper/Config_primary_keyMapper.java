package hr.mapper;

import java.util.List;

import hr.pojo.Config_primary_key;
import hr.pojo.Salary_grant;
import hr.pojo.Salary_standard_details;
import hr.pojo.Training;

public interface Config_primary_keyMapper {
	public void insertConfig_primary_key(Config_primary_key config_primary_key);
	public void updateConfig_primary_key(Config_primary_key config_primary_key);
	public Config_primary_key selectConfig_primary_keyById(int id);
	public List<Config_primary_key> getConfig_primary_key();
	public boolean deleteConfig_primary_keyById(int sid);
}
