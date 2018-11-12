package com.company.service.iservice;

import com.company.service.dto.Loginvo;

public interface UserService {
boolean login(Loginvo loginvo);
boolean isUserExist(String username);
}
