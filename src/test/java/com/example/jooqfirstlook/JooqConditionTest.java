package com.example.jooqfirstlook;

import com.example.jooqfirstlook.actor.ActorRepository;
import org.assertj.core.api.Assertions;
import org.jooq.generated.tables.pojos.Actor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

@SpringBootTest
public class JooqConditionTest {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    @DisplayName("and 조건 검색 - firstName, LastName이 일치하는 배우 조회")
    void test1() {
        String firstName = "ED";
        String lastName = "CHASE";

        List<Actor> actorList = actorRepository.findByFirstNameAndLastName(firstName, lastName);

        Assertions.assertThat(actorList).hasSize(1);
    }

    @Test
    @DisplayName("or 조건 검색 - firstName, LastName 중 하나라도 일치하는 배우 조회")
    void test2() {
        String firstName = "ED";
        String lastName = "CHASE";

        List<Actor> actorList = actorRepository.findByFirstNameOrLastName(firstName, lastName);

        Assertions.assertThat(actorList).hasSizeGreaterThan(1);
    }

    @Test
    @DisplayName("in 절 - 동적 조건 검색")
    void test3() {
        List<Actor> actorList = actorRepository.findByActorIdIn(List.of(1L));

        Assertions.assertThat(actorList).hasSize(1);
    }

    @Test
    @DisplayName("in 절 - 동적 조건 검색")
    void test4() {
        List<Actor> actorList = actorRepository.findByActorIdIn(Collections.emptyList());

        Assertions.assertThat(actorList).hasSizeGreaterThan(1);
    }

    @Test
    @DisplayName("다중 조건 검색 - 배우 이름으로 조회")
    void test5() {

    }

    @Test
    @DisplayName("다중 조건 검색 - 배우 이름과 영화 제목으로 조회")
    void test6() {

    }
}
