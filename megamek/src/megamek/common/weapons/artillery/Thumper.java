/*
 * MegaMek - Copyright (C) 2004, 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package megamek.common.weapons.artillery;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;
import megamek.common.SimpleTechLevel;

/**
 * @author Sebastian Brocks
 * @since Oct 20, 2004
 */
public class Thumper extends ArtilleryWeapon {
    private static final long serialVersionUID = -3256813053043672610L;

    public Thumper() {
        super();
        name = "Thumper";
        setInternalName(EquipmentTypeLookup.THUMPER_ARTY);
        addLookupName("ISThumperArtillery");
        addLookupName("IS Thumper");
        addLookupName("CLThumper");
        addLookupName("CLThumperArtillery");
        addLookupName("Clan Thumper");
        heat = 5;
        rackSize = 15;
        ammoType = AmmoType.AmmoTypeEnum.THUMPER;
        shortRange = 1;
        mediumRange = 2;
        longRange = 21;
        extremeRange = 21; // No extreme range.
        tonnage = 15;
        criticals = 15;
        svslots = 7;
        bv = 43;
        cost = 187500;
        rulesRefs = "284, TO";
        techAdvancement.setTechBase(TechBase.ALL)
            .setTechRating(TechRating.B).setAvailability(AvailabilityValue.C, AvailabilityValue.C, AvailabilityValue.C, AvailabilityValue.C)
            .setAdvancement(DATE_PS, DATE_PS, DATE_NONE, DATE_NONE, DATE_NONE)
            .setPrototypeFactions(Faction.TH).setProductionFactions(Faction.TH)
            .setStaticTechLevel(SimpleTechLevel.ADVANCED);
    }
}
