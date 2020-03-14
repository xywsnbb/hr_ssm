package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;
import hr.pojo.HumanFileDig;

@Repository
public interface HumanFileDigMapper {
	public boolean insertHumanFileDig(HumanFileDig humanfiledig);
	public boolean updateHumanFileDigById(HumanFileDig humanfiledig);
	public boolean deleteHumanFileDigById(int id);
	public HumanFileDig selectHumanFileDigById(int id);
	public List<HumanFileDig> selectHumanFileDig();
}
