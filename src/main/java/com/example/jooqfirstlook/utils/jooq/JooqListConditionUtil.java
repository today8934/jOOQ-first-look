package com.example.jooqfirstlook.utils.jooq;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.impl.DSL;

import java.util.List;

public class JooqListConditionUtil {

    public static <T> Condition inIfNotEmpty(Field<T> field, List<T> list) {
        return list == null || list.isEmpty() ? DSL.noCondition() : field.in(list);
    }
}
