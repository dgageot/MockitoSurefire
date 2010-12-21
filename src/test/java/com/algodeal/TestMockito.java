package com.algodeal;

import org.junit.*;
import org.mockito.*;

public class TestMockito
{
    @Test
    public void canMockPrivateStaticClass()
    {
        Mockito.mock(PrivateClass.class);
    }

    private static class PrivateClass
    {
        // empty
    }
}
