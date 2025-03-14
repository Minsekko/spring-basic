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


        return result;
    }
}
