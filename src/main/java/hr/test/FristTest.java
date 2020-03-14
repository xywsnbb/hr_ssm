package hr.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.*;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileSecondKind;
import hr.pojo.Config_public_char;
import hr.pojo.HumanFile;
import hr.pojo.HumanFileDig;
import hr.pojo.MajorChange;
import hr.pojo.User;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;
import hr.service.Config_public_charService;
import hr.service.HumanFileDigService;
import hr.service.HumanFileService;
import hr.util.IdMap;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FristTest {
	
	@Autowired
	private Config_public_charService service;
	
	@Test
	public void test(){
		Config_public_char cpc = new Config_public_char();
		cpc.setPbc_id(39);
		cpc.setAttribute_kind("职称");
		cpc.setAttribute_name("架构");
		service.saveConfig_public_char(cpc);
		
//		ConfigFileFirstKind cffk = new ConfigFileFirstKind();
//		cffk.setFfk_id(1);
//		cffk.setFirst_kind_name("集团");
//		
//		service.modifyConfigFileFirstKind(cffk);
//		
		List<Config_public_char> list = service.queryConfig_public_char();
		for (Config_public_char configFileFirstKind : list) {
			System.out.println(configFileFirstKind.getAttribute_name());
			System.out.println(configFileFirstKind.getAttribute_kind());
		}
	}
}
