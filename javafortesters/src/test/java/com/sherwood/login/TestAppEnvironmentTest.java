package com.sherwood.login;

import com.domainobject.TestAppEnv;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Domain","https://gonzo-sherwood-dev.bsgroup.eu/welcome",TestAppEnv.getUrl() );
        TestAppEnv.getUrl();
    }
    @Test
    public void canGetDomainStatically(){
        Assert.assertEquals("Just the Domain", "https://gonzo-sherwood-dev.bsgroup.eu/welcome", TestAppEnv.DOMAIN);

    }

}

