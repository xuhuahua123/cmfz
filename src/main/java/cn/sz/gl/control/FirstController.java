package cn.sz.gl.control;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * ssm���ɣ�
 * 		ssm:  spring4.3+springmvc4.3+mybatis3.2
 * 		ssh : spring+struts2+hibernate  
 * 
 * ���ｨ���ȴspring����
 * 
 * 
 * 1.�spring����:
 * 		a.��ӱ�Ҫ������
 * 		b.׼��spring�����ļ�
 * 		c.��web.xml�ļ��У�����spring�������������Ĳ���;
 * 			������������������������������ʱ��׼����spring����;
 * 			�����Ĳ���������ָ��spring�����ļ���·��������
 *		
 * 2.mybatis����
 * 		a.�������
 * 			mybatis��������;
 * 			���ݿ���������;
 * 			mybatis-spring֧�ֵ�����;
 * 			����Դ����;
 * 		��������Դ�����߰��ж��֣����������commons��apache�ṩ�Ĺ��߰���;
 * 								   c3p0;
 * 								   druid(�����ṩ�ĵ�³��)
 * 
 * 		b.׼��mybatis�������ļ�
 * 			����׼�������ļ�����������ʵ��ӳ���ļ�������ȫ�ֲ���
 * 		c.��������Դ
 * 			��spring�����ļ��У�׼��dataSource,sqlSessionFactory
 * 			���ԣ������Ǳ��룩����mybatis����ģ�����sqlSessionTemplate
 * 		d.׼��ʵ�����ʵ��ӳ���ļ�
 * 
 * 3.springMVC����
 * 		a.�������
 * 		b.web.xml��׼��DispatcherServlet,��ͨ����ʼ�������ķ�ʽ��ָ��mvc�������ļ����ֺ�·��
 * 		c.�������ļ��У�����mvcע����������ͼ������
 * 		d.����springע�����������ɨ��ķ�Χ
 * 
 * @author Administrator
 *
 */
public class FirstController {

	public void show() {
	}
	
}
