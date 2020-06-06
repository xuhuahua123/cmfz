package cn.sz.gl.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import cn.sz.gl.dao.IEmpDAO;
import cn.sz.gl.pojo.Emp;
@Repository
public class EmpDAOImpl extends SqlSessionDaoSupport implements IEmpDAO {

	//private SqlSessionTemplate template;
	
	public Emp findById(Integer empno) {
		return this.getSqlSession().selectOne("cn.sz.gl.pojo.Emp.findEmpByEmpno", empno);
	}

}
