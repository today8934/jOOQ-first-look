package com.example.jooqfirstlook.film;

import org.jooq.Configuration;
import org.jooq.generated.tables.daos.FilmDao;
import org.jooq.generated.tables.pojos.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepositoryHasA {

    private final FilmDao filmDao;

    public FilmRepositoryHasA(Configuration configuration) {
        this.filmDao = new FilmDao(configuration);
    }

    public Film findByid(Long id) {
        return filmDao.findById(id);
    }

    public List<Film> findByRangeBetween(Integer from, Integer to) {
        return filmDao.fetchRangeOfLength(from, to);
    }
}
