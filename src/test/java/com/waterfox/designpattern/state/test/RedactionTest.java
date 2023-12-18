package com.waterfox.designpattern.state.test;

import com.waterfox.designpattern.state.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedactionTest
{

    @Test
    void redact()
    {
        Redaction r = new Redaction();
        assertEquals(r.state.getClass(), WriteState.class);
    }

    @Test
    void after()
    {
        Redaction r = new Redaction();
        assertEquals(r.state.getClass(), WriteState.class);
        r.after(true);
        assertEquals(r.state.getClass(), ProofreadState.class);
        r.after(false);
        assertEquals(r.state.getClass(), WriteState.class);
        r.after(true);
        assertEquals(r.state.getClass(), ProofreadState.class);
        r.after(true);
        assertEquals(r.state.getClass(), EmbedState.class);
        r.after(true);
        assertEquals(r.state.getClass(), BroadcastState.class);
        r.after(true);
        assertEquals(r.state.getClass(), WriteState.class);
    }
}