package cn.sz.gl.service.impl;

import org.springframework.stereotype.Service;

import cn.sz.gl.dao.IEmpDAO;
import cn.sz.gl.pojo.Emp;
import cn.sz.gl.service.IEmpService;
@Service
public class EmpServiceImpl implements IEmpService {

	
	private IEmpDAO empDAOImpl;
	
	public Emp findById(Integer empno) {
		if(empno==null) {
			return null;
		}
		return empDAOImpl.findById(empno);
	}

	public IEmpDAO getEmpDAOImpl() {
		return empDAOImpl;
	}

	public void setEmpDAOImpl(IEmpDAO empDAOImpl) {
		this.empDAOImpl = empDAOImpl;
	}

}
