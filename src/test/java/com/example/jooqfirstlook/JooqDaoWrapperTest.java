package com.example.jooqfirstlook;

import com.example.jooqfirstlook.film.FilmRepositoryHasA;
import com.example.jooqfirstlook.film.FilmRepositoryIsA;
import org.assertj.core.api.Assertions;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class JooqDaoWrapperTest {

    @Autowired
    FilmRepositoryIsA filmRepositoryIsA;

    @Autowired
    FilmRepositoryHasA filmRepositoryHasA;

    @Test
    void test() {
        filmRepositoryIsA.findById(10L);
    }

    @Test
    @DisplayName("상속) 자동생성 DAO 사용 - 영화 길이가 100 ~ 180분 사이인 영화 조회")
    void 상속_DAO_1() {
        List<Film> films = filmRepositoryIsA.fetchRangeOfLength(100, 180);

        Assertions.assertThat(films).allSatisfy(film -> Assertions.assertThat(film.getLength()).isBetween(100, 180));
    }

    @Test
    @DisplayName("합성) 자동생성 DAO 사용 - 영화 길이가 100 ~ 180분 사이인 영화 조회")
    void 합성_DAO_1() {
        List<Film> films = filmRepositoryHasA.findByRangeBetween(100, 180);

        Assertions.assertThat(films).allSatisfy(film -> Assertions.assertThat(film.getLength()).isBetween(100, 180));
    }
}
