/*
 * Copyright 2007 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.ja-sig.org/products/cas/overview/license/
 */
package org.jasig.cas;

import org.jasig.cas.authentication.AuthenticationManager;
import org.jasig.cas.ticket.registry.TicketRegistry;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 */
@ContextConfiguration("applicationContext.xml")
public abstract class AbstractCentralAuthenticationServiceTest extends AbstractJUnit4SpringContextTests {

    private CentralAuthenticationService centralAuthenticationService;

    private TicketRegistry ticketRegistry;

    private AuthenticationManager authenticationManager;

    public AuthenticationManager getAuthenticationManager() {
        return this.authenticationManager;
    }

    public void setAuthenticationManager(final AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public CentralAuthenticationService getCentralAuthenticationService() {
        return this.centralAuthenticationService;
    }

    public void setCentralAuthenticationService(final CentralAuthenticationService centralAuthenticationService) {
        this.centralAuthenticationService = centralAuthenticationService;
    }

    public TicketRegistry getTicketRegistry() {
        return this.ticketRegistry;
    }

    public void setTicketRegistry(final TicketRegistry ticketRegistry) {
        this.ticketRegistry = ticketRegistry;
    }
}
