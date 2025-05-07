package com.example.jooqfirstlook.actor;

import com.example.jooqfirstlook.utils.jooq.JooqListConditionUtil;
import org.jooq.*;
import org.jooq.generated.tables.JActor;
import org.jooq.generated.tables.daos.ActorDao;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.records.ActorRecord;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorRepository {

    private final DSLContext dslContext;
    private final JActor ACTOR = JActor.ACTOR;
    private final ActorDao actorDao;

    public ActorRepository(DSLContext dslContext, Configuration configuration) {
        this.dslContext = dslContext;
        this.actorDao = new ActorDao(configuration);
    }

    public List<Actor> findByFirstNameAndLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
                .where(ACTOR.FIRST_NAME.eq(firstName).and(ACTOR.LAST_NAME.eq(lastName)))
                .fetchInto(Actor.class);
    }

    public List<Actor> findByFirstNameOrLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
                .where(ACTOR.FIRST_NAME.eq(firstName).or(ACTOR.LAST_NAME.eq(lastName)))
                .fetchInto(Actor.class);
    }

    public List<Actor> findByActorIdIn(List<Long> longs) {
        return dslContext.selectFrom(ACTOR)
                .where(JooqListConditionUtil.inIfNotEmpty(ACTOR.ACTOR_ID, longs))
                .fetchInto(Actor.class);
    }


}
