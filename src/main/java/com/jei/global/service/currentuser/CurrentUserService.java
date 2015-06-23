package com.jei.global.service.currentuser;

import com.jei.global.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
