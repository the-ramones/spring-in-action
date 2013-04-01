package com.springinaction.chapter1;

import com.springinaction.chapter1.Quest;

/**
 *
 * @author paul
 */
public class BraveKnight {
 
    private Quest quest = null;

    public BraveKnight() {
    }

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    
    public void embarkOnQuest() {
        quest.embark();
    }
}
