package com.example.jooqfirstlook;

import org.jooq.DSLContext;
import org.jooq.generated.tables.JActor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JOoqFirstLookApplicationTests {

    @Autowired
    DSLContext dslContext;

    @Test
    void contextLoads() {
    }

    @Test
    void testJOOQ() {
        // Example of using jOOQ to fetch data
        var result = dslContext.selectFrom(JActor.ACTOR).limit(10).fetch();
        System.out.println(result);
    }

}
