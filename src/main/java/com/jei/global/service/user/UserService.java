package com.jei.global.service.user;

import java.util.Collection;

import com.jei.global.domain.User;
import com.jei.global.domain.UserCreateForm;

public interface UserService {

    User getUserById(long id);

    User getUserByUserId(String userId);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
