public enum CSpells{
    LAYONHANDS(10, "LayOnHands"), TURNUNDEAD(15, "TurnUndead"), CHANNELDIVINITY(20, "ChannelDivinity"), HEALINGWORD(25, "HealingWord"), MASSHEALINGWORD(30, "MassHealingWord"), GREATERRESTORATION(35, "GreaterRestoration"), REGENERATION(40, "Regerneration"), MASSREGENERATION(45, "MassRegeration"), DIVINEINTERVENTION(50, "DivineIntervention"), MIRACLE(55, "Miracle"), HOLYSMITE(60, "HolySmite"), BLESSING(65, "Blessing"), SACREDFLAME(70, "SacredFlame"), DIVINEPROTECTION(75, "DivineProtection"), AURAOFCOURAGE(80, "AuraOfCourage"), AURAOFPROTECTION(85, "AuraOfProtection"), AURAOFWISDOM(90, "AuraOfWisdom"), AURAOFSTRENGTH(95, "AuraOfStrength");
    int healing;
    String spellName;
    CSpells(int healing, String spellName){
        this.healing = healing;
        this.spellName = spellName;
    }
  }
