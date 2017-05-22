package com.melodymoselle.knightsTale.Knights;

import com.melodymoselle.knightsTale.Quests.Quest;

public class BraveKnight implements Knight{
    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
