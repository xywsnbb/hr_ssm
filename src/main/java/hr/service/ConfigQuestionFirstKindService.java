package hr.service;

import java.util.List;

import hr.pojo.ConfigQuestionFirstKind;

public interface ConfigQuestionFirstKindService {
	public boolean addQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
	public boolean modifyQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
	public List<ConfigQuestionFirstKind> queryAllConfigQuestionFirstKind();
	public ConfigQuestionFirstKind queryConfigQuestionFirstKindById(int qfk_id);
	public boolean removeConfigQuestionFirstKindById(int qfk_id);
	
	public Integer queryMaxId();
}
