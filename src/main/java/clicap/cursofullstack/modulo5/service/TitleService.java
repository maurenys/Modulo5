package clicap.cursofullstack.modulo5.service;

import java.util.List;

import clicap.cursofullstack.modulo5.model.dto.TitleDto;

public interface TitleService {
	
	public int insert(TitleDto titleDto);
	public TitleDto get(String title_no);
	public int update(TitleDto titleDto);
	public int delete(String title_no);
	public List<TitleDto> list();
	
	
}
