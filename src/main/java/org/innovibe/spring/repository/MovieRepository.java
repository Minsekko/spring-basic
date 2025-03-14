package org.innovibe.spring.repository;

import lombok.AllArgsConstructor;
import org.innovibe.spring.model.Movie;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@AllArgsConstructor
@Repository
public class MovieRepository {
    private DataSource dataSource;
    public boolean create(Movie movie) {
        boolean result = false;
        try {

            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into movies values(null,?,?,?,?)");
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getDescription());
            ps.setString(3, movie.getGenre());
            ps.setDate(4,Date.valueOf(movie.getReleaseDate()));

            ps.executeUpdate();
            result = true;
        } catch (SQLException e) {
            System.out.println("MovieRepository.Create error");
        }

        return result;
    }
}
