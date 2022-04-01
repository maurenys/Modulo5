package clicap.cursofullstack.modulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clicap.cursofullstack.modulo5.model.dao.TitleDao;

import clicap.cursofullstack.modulo5.model.dto.TitleDto;


@Service
public class TiltleServiceImpl implements TitleService {
	
	@Autowired
	TitleDao titleDao;

	public TiltleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(TitleDto titleDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TitleDto get(String title_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TitleDto titleDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String title_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TitleDto> list() {
		// TODO Auto-generated method stub
		return titleDao.list();
	}
	
}
