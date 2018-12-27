package com.agile.framework.security.web;

import com.agile.framework.security.session.Session;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

public class WebSecuritySession implements HttpSession,Session{


    private HttpSession session;

    public WebSecuritySession(HttpSession session) {
        this.session=session;
    }

    @Override
    public long getCreationTime() {
        return session.getCreationTime();
    }

    @Override
    public String getId() {
        return session.getId();
    }

    @Override
    public long getLastAccessedTime() {
        return session.getLastAccessedTime();
    }

    @Override
    public ServletContext getServletContext() {
        return session.getServletContext();
    }

    @Override
    public void setMaxInactiveInterval(int i) {
        session.setMaxInactiveInterval(i);
    }

    @Override
    public int getMaxInactiveInterval() {
        return session.getMaxInactiveInterval();
    }

    @Override
    public HttpSessionContext getSessionContext() {
        return session.getSessionContext();
    }

    @Override
    public Object getAttribute(String s) {

        return session.getAttribute(s);
    }

    @Override
    public Object getValue(String s) {
        return session.getValue(s);
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        return session.getAttributeNames();
    }

    @Override
    public String[] getValueNames() {
        return session.getValueNames();
    }

    @Override
    public void setAttribute(String s, Object o) {

        session.setAttribute(s,o);
    }

    @Override
    public void putValue(String s, Object o) {
        session.putValue(s,o);
    }

    @Override
    public void removeAttribute(String s) {
        session.removeAttribute(s);
    }

    @Override
    public void removeValue(String s) {
        session.removeValue(s);
    }

    @Override
    public void invalidate() {
        session.invalidate();
    }

    @Override
    public boolean isNew() {
        return session.isNew();
    }
}