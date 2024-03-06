package com.LLC.ProductionProcess.auth.rest.service;

import com.LLC.ProductionProcess.auth.entity.Login;
import com.LLC.ProductionProcess.auth.entity.Register;

public interface AuthService {

    String login(Login login);

    String register(Register register);
}
