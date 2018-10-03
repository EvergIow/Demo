package com.read.excel;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtil {

	
	
	public static SqlSession getSqlSession() throws IOException{
		//通过配置文件获取数据库连接信息,传入配置文件的包路径
		Reader reader=Resources.getResourceAsReader("SqlMapperConfig.xml");
		//通过配置信息构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		//通过SqlSessionFactory打开一个数据库会话
		
		SqlSession sqlSession =sqlSessionFactory.openSession();
		//返回sqlSession对象
		return sqlSession;
		}


}
