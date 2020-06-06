package cn.sz.gl.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.sz.gl.pojo.Emp;
import cn.sz.gl.service.IEmpService;

@Controller
@RequestMapping("/ec")
public class EmpController {

	private IEmpService empServiceImpl;
	
	@RequestMapping(value="findbyid",method=RequestMethod.GET)
	public String findbyid(Integer empno,Model model) {
		Emp emp = empServiceImpl.findById(empno);
		model.addAttribute("emp", emp);
		return "emp_info";
	}

	public IEmpService getEmpServiceImpl() {
		return empServiceImpl;
	}

	public void setEmpServiceImpl(IEmpService empServiceImpl) {
		this.empServiceImpl = empServiceImpl;
	}
}
