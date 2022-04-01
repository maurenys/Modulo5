package clicap.cursofullstack.modulo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String getHome() {
		return("index");
	}
	
	@RequestMapping("/departments_page")
	public String getDepartments() {
		return("departments_page");
	}
	
}


