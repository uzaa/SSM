package com.tyotann.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class IbatisGenerator {

	public static void main(String[] args) throws Exception {

		new IbatisGenerator().generator();

	}

	public void generator() throws Exception {

		List<String> warnings = new ArrayList<String>();
		
		//����ԭ�ȴ���
//		File oldFileDir =  new File(new File(this.getClass().getResource("/").getPath()).getParent() + "\\src\\com\\finstone\\");
//		oldFileDir.isDirectory();
//		oldFileDir.delete();

		File configFile = new File(new File(this.getClass().getResource("/").getPath()).getParent() + "\\config\\abatorConfig.fengdu.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);

		new MyBatisGenerator(cp.parseConfiguration(configFile), new DefaultShellCallback(true), warnings).generate(null);

	}
}
