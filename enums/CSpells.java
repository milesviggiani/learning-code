public enum CSpells{
    LAYONHANDS(10, "LayOnHands"), TURNUNDEAD(0, "TurnUndead"), CHANNELDIVINITY(20, "ChannelDivinity"), HEALINGWORD(15, "HealingWord"), MASSHEALINGWORD(20, "MassHealingWord"), GREATERRESTORATION(25, "GreaterRestoration"), REGENERATION(25, "Regerneration"), MASSREGENERATION(30, "MassRegeration"), DIVINEINTERVENTION(10, "DivineIntervention"), MIRACLE(15, "Miracle"), BLESSING(5, "Blessing"), DIVINEPROTECTION(10, "DivineProtection"), AURAOFCOURAGE(0, "AuraOfCourage"), AURAOFPROTECTION(10, "AuraOfProtection"), AURAOFWISDOM(0, "AuraOfWisdom"), AURAOFSTRENGTH(0, "AuraOfStrength");
    int healing;
    String spellName;
    CSpells(int healing, String spellName){
        this.healing = healing;
        this.spellName = spellName;
    }
  }
