package com.agile.framework.security;

import com.agile.framework.security.session.Session;

public interface VerifyService {

    public boolean doAuthorize(Session session);

    public void doVerify(Object token);
}