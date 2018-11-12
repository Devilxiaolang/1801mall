package com.company.dao.idao;

import com.company.dao.pojo.User;
import com.company.service.dto.Loginvo;

public interface UserDao {
public Integer login(Loginvo loginvo);
public Integer isUserExist(String username);
}
