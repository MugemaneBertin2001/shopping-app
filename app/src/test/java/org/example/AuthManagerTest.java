package org.example;

import org.junit.jupiter.api.Test;

import utils.classes.AuthManager;

import static org.junit.jupiter.api.Assertions.*;

class AuthManagerTest {
    @Test
    void authManagerIsSingleton() {
        AuthManager manager1 = AuthManager.getInstance();
        AuthManager manager2 = AuthManager.getInstance();
        assertSame(manager1, manager2, "AuthManager should be a singleton");
    }
}
