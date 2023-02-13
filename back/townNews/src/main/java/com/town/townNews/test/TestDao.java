package com.town.townNews.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	private static Logger logger = LoggerFactory.getLogger(TestDao.class);
	
	@Autowired
	SqlSession sqlSession;
	
	private static final String mapperName = "com.town.townNews.test.testMapper";
	
	public List<Map<String, Object>> getAllTestData() {
		List<Object> listData = sqlSession.selectList(mapperName + ".selectUserTest");
		for(int i=0; i<listData.size(); i++) {
			System.out.println("LIST DATA 설정 : " + listData.get(i));
		}
		return sqlSession.selectList(mapperName + ".selectUserTest");
	}
	
	
	
}
