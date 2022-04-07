package clicap.cursofullstack.modulo5.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import clicap.cursofullstack.modulo5.model.dto.TitleDto;


@Repository
@Transactional
public class TitleDaoImpl implements TitleDao {
	
	private String insert = "INSERT INTO title_types VALUES (?,?)";
	private String update = "UPDATE title_types SET title=? WHERE title_no=?";
	private String select = "SELECT * FROM title_types WHERE title_no=?";
	private String delete = "DELETE FROM title_types WHERE title_no=?";
	private String list = "SELECT * FROM title_types";

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public TitleDaoImpl() {
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
		List<TitleDto> listTitle = jdbcTemplate.query(list,BeanPropertyRowMapper.newInstance(TitleDto.class));
		return listTitle;
	}

	
}
