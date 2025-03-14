package org.innovibe.spring.repository;

import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.innovibe.spring.model.Movie;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
@Repository
public class MovieRepository {

    private SqlSessionTemplate sqlSessionTemplate;

    public boolean create(Movie movie) {
        int r = sqlSessionTemplate.insert("movie.create", movie);
        return r > 0 ? true : false;
    }

    public List<Movie> findAll() {
        /*
        selectTag 를 사용할때는 selectOne 아니면 selectList 둘중에 하나를 사용한다고 생각하면 됨.
         */
        return sqlSessionTemplate.selectList("movie.findAll");

    }

    public Movie findById(int id) {
        return sqlSessionTemplate.selectOne("movie.findById",id);
    }

}
