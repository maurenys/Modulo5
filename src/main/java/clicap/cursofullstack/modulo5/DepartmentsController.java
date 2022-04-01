package clicap.cursofullstack.modulo5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clicap.cursofullstack.modulo5.model.dao.DepartmentsDao;
import clicap.cursofullstack.modulo5.model.dto.DepartmentsDTO;
import clicap.cursofullstack.modulo5.service.DepartmentsService;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {
	
	@Autowired
	DepartmentsService departmentsService;

	@RequestMapping("/list")
	public @ResponseBody List<DepartmentsDTO> list(){
		
		return departmentsService.list();
	
	}
}
