package com.toyprj;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
//@Configuration
//@MapperScan(basePackages="com.toyprj.db.mapper")
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootSampleApplication.class, args);

	}
	
	 @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource);
	        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	        sessionFactory.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
	        return sessionFactory.getObject();
	    }
	    
	    @Bean
	    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
	      final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
	      return sqlSessionTemplate;
	    }
	 

}
