package cn.sz.gl.control;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * ssm集成：
 * 		ssm:  spring4.3+springmvc4.3+mybatis3.2
 * 		ssh : spring+struts2+hibernate  
 * 
 * 这里建议先搭建spring环境
 * 
 * 
 * 1.搭建spring环境:
 * 		a.添加必要的依赖
 * 		b.准备spring配置文件
 * 		c.在web.xml文件中，配置spring监听器和上下文参数;
 * 			监听器用来监听服务器启动，启动时就准备好spring容器;
 * 			上下文参数，用来指定spring配置文件的路径和名字
 *		
 * 2.mybatis环境
 * 		a.添加依赖
 * 			mybatis核心依赖;
 * 			数据库驱动依赖;
 * 			mybatis-spring支持的依赖;
 * 			数据源依赖;
 * 		对于数据源，工具包有多种，比如这里的commons（apache提供的工具包）;
 * 								   c3p0;
 * 								   druid(阿里提供的德鲁伊)
 * 
 * 		b.准备mybatis的配置文件
 * 			可以准备配置文件，用来引入实体映射文件和配置全局参数
 * 		c.配置数据源
 * 			在spring配置文件中，准备dataSource,sqlSessionFactory
 * 			可以（但不是必须）配置mybatis操作模板对象sqlSessionTemplate
 * 		d.准备实体类和实体映射文件
 * 
 * 3.springMVC环境
 * 		a.添加依赖
 * 		b.web.xml中准备DispatcherServlet,并通过初始化参数的方式，指明mvc的配置文件名字和路径
 * 		c.在配置文件中，引入mvc注解驱动和视图处理器
 * 		d.配置spring注解驱动和组件扫描的范围
 * 
 * @author Administrator
 *
 */
public class FirstController {

	public void show() {
	}
	
}
