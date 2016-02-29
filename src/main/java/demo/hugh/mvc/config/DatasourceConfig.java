package demo.hugh.mvc.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//@Configuration
//@PropertySource("classpath:datasource.properties")
//@MapperScan(basePackages = "xxx.repository", sqlSessionFactoryRef = "sqlSessionFactory")
public class DatasourceConfig {

	private static Logger log = Logger.getLogger(DatasourceConfig.class);

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		Map<String, String> properties = new HashMap<>();
		properties.put("url", env.getProperty("xxx.db.url"));
		properties.put("username", env.getProperty("xxx.db.username"));
		properties.put("password", env.getProperty("xxx.db.password"));
		try {
			return DruidDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			log.error("初始化数据库失败", e);
			return null;
		}
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setTypeAliasesPackage("xxx.mybatis");
		return sessionFactory.getObject();
	}
}