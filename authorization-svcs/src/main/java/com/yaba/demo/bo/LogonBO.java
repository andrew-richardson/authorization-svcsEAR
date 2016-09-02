package com.yaba.demo.bo;

import com.yaba.demo.model.domain.UserCredential;

import javax.ejb.Stateless;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by andrew on 8/31/16.
 */
@Stateless
public class LogonBO {

    private static Logger LOG = Logger.getLogger(LogonBO.class.getName());

    public boolean logon(UserCredential userCredential) {
        LOG.entering(this.getClass().getSimpleName(), "logon");
        LOG.log(Level.INFO, userCredential.toString());
        LOG.exiting(this.getClass().getSimpleName(), "logon");
        return true;
    }
}
