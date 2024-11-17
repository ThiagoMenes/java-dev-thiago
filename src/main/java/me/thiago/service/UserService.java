package me.thiago.service;

import me.thiago.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
