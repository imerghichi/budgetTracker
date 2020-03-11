package com.tracker.demo.DAO;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class UserDao extends HibernateDaoSupport {
    public static final int id = 0;

    public static final String username = "";

    public static final  String email = "";

    public static final  String password = "";

    @Override
    protected void initDao() throws Exception {
    }


}
