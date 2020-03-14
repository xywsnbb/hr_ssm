package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.MajorChangeMapper;
import hr.pojo.MajorChange;
import hr.service.MajorChangeService;

@Service
public class MajorChangeServiceImpl implements MajorChangeService{
	@Autowired
	private MajorChangeMapper mapper = null;
	
	@Override
	public boolean saveMajorChange(MajorChange majorchange) {
		return mapper.insertMajorChange(majorchange);
	}

	@Override
	public boolean removeMajorChange(int id) {
		return mapper.deleteMajorChange(id);
	}

	@Override
	public boolean modifyMajorChange(MajorChange majorchange) {
		return mapper.updateMajorChange(majorchange);
	}

	@Override
	public MajorChange queryMajorChangeById(int id) {
		return mapper.selectMajorChangeById(id);
	}

	@Override
	public List<MajorChange> queryMajorChange() {
		return mapper.selectMajorChange();
	}

}
