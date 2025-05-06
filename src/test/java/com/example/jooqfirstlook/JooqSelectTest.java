package com.example.jooqfirstlook;

import com.example.jooqfirstlook.film.FilmRepository;
import com.example.jooqfirstlook.film.FilmService;
import com.example.jooqfirstlook.film.SimpleFilmInfo;
import com.example.jooqfirstlook.web.FilmWithActorPagedResponse;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JooqSelectTest {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmService filmService;

    @Test
    @DisplayName("1) 영화정보 조회")
    public void testSelect() {
        Film film = filmRepository.findById(1L);
        Assertions.assertEquals(1L, (long) film.getFilmId());
    }

    @Test
    @DisplayName("2) 영화정보 조회 - SimpleFilmInfo")
    public void test2() {
        SimpleFilmInfo simpleFilmInfoById = filmRepository.findSimpleFilmInfoById(1L);
        Assertions.assertEquals(1L, (long) simpleFilmInfoById.filmId());
    }

    @Test
    @DisplayName("3) 영화와 영화에 출연한 배우 정보를 페이징하여 조회")
    public void test3() {
        FilmWithActorPagedResponse filmActorPageResponse = filmService.getFilmActorPageResponse(1L, 20L);
        System.out.println(filmActorPageResponse);
    }
}
