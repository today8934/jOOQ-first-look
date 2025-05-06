package com.example.jooqfirstlook.film;

import org.jooq.Configuration;
import org.jooq.generated.tables.daos.FilmDao;
import org.springframework.stereotype.Repository;

@Repository
public class FilmRepositoryIsA extends FilmDao {

    public FilmRepositoryIsA(Configuration configuration) {
        super(configuration);
    }
}
