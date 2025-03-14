package org.innovibe.spring.repository;

import lombok.AllArgsConstructor;
import org.innovibe.spring.model.Movie;
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

    private JdbcTemplate jdbcTemplate;

    public boolean create(Movie movie) {
        boolean result = false;
        /*
            executeUpdate() 를 해야되는 작업 : insert,update, delete
            는 template.update()
            executQuery :
         */

        int r = jdbcTemplate.update("insert into movies(title,description, genre, release_date) values (?,?,?,?)",
                movie.getTitle(),movie.getDescription(),movie.getGenre(),movie.getReleaseDate()
        );

        return r > 0 ? true : false;
    }

    public List<Movie> findAll() {
        String sql = "select * from movies";

        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class));

        return list;
    }
    public Movie findById(int id) {
        String sql = "select * from movies where id =?";
        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class), id);

        return list.isEmpty() ? null : list.get(0);
    }
}
