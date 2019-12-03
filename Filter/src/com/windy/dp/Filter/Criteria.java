package com.windy.dp.Filter;

import com.windy.dp.Filter.entity.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
