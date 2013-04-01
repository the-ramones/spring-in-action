package com.springinaction.chapter1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author paul
 */
public class KnightEmbarkTest {
    
    public KnightEmbarkTest() {
    }

    @Test
    public void KnighShouldEmbarkOnQuest() {
        Quest quest = mock(Quest.class);
        
        BraveKnight bknight = new BraveKnight(quest);
        
        assertNotNull(bknight);
        
        bknight.embarkOnQuest();
        
        /* Verify that Quest.embark method was called 
         *only 1 time (inside .embarkOnQuest(), you know)
         */ 
        verify(quest, times(1)).embark();
    }
}
