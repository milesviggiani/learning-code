public enum CSpells{
    LAYONHANDS(10, "LayOnHands"), TURNUNDEAD(15, "TurnUndead"), CHANNELDIVINITY(20, "ChannelDivinity"), HEALINGWORD(25, "HealingWord"), MASSHEALINGWORD(30, "MassHealingWord"), GREATERRESTORATION(35, "GreaterRestoration"), REGENERATION(40, "Regerneration"), MASSREGENERATION(45, "MassRegeration");
    int healing;
    String spellName;
    CSpells(int healing, String spellName){
        this.healing = healing;
        this.spellName = spellName;
    }
  }
