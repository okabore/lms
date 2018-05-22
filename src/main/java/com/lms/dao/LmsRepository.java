package com.lms.dao;

import org.springframework.data.repository.CrudRepository;

import com.lms.models.Book;

public interface LmsRepository extends CrudRepository<Book, Long> {

}
