package clicap.cursofullstack.modulo5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import clicap.cursofullstack.modulo5.model.dto.TitleDto;
import clicap.cursofullstack.modulo5.service.TitleService;

@Controller
@RequestMapping("/title")
public class TitleController {

	@Autowired
	TitleService titleService;

	@RequestMapping("/list")
	public @ResponseBody List<TitleDto> list() {
		return titleService.list();

	}

}
