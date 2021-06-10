package book_shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import book_shop.entity.MapperSlides;
import book_shop.entity.Slide;

@Repository
public class SlidesDAO extends BaseDAO {
	public List<Slide> getSlides() {
		List<Slide> slides = new ArrayList<Slide>();
		String sql = "SELECT * FROM slides";
		slides = _jdbcTemplate.query(sql, new MapperSlides());
		return slides;
	}
}
