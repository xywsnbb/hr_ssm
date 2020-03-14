package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigQuestionFirstKind;


@Repository
public interface ConfigQuestionFirstKindMapper {
	public boolean saveQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
	public boolean updateQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
	public List<ConfigQuestionFirstKind> selectAllConfigQuestionFirstKind();
	public ConfigQuestionFirstKind selectConfigQuestionFirstKindById(int qfk_id);
	public boolean deleteConfigQuestionFirstKindById(int qfk_id);
	
	public Integer selectMaxId();
}
