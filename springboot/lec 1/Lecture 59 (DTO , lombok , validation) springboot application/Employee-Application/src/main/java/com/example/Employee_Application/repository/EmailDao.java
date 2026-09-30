package com.example.Employee_Application.repository;

import com.example.Employee_Application.entity.Email;

import java.util.List;
import java.util.Optional;

public interface EmailDao {

    Email save(Email email);

    Email update(Email email);

    void delete(Email email);

    Optional<Email> findById(Long id);

    List<Email> findAll();

    List<Email> findByName(String name);

    List<Email> findByNames(List<String> names);

    List<Email> findByContent(String content);
}