package com.bank.api.service;

import com.bank.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
