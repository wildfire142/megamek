/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Ben Grills
 */
public class InfantryPistolSternsnachtPythonAutoPistolWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantryPistolSternsnachtPythonAutoPistolWeapon() {
		super();
		name = "Auto-Pistol (Sternsnacht Python)";
		setInternalName(name);
		addLookupName("InfantrySternsnachtPython");
		addLookupName("Sternsnacht Python AutoPistol");
		ammoType = AmmoType.AmmoTypeEnum.INFANTRY;
		cost = 125;
		bv = 0.26;
		tonnage = .00075;
		flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
		infantryDamage = 0.28;
		infantryRange = 0;
		ammoWeight = 0.00016;
		ammoCost = 4;
		shots = 12;
		rulesRefs = "273, TM";
		techAdvancement.setTechBase(TechBase.IS).setISAdvancement(3048, 3051, 3068, DATE_NONE, DATE_NONE)
				.setISApproximate(true, false, false, false, false)
				.setPrototypeFactions(Faction.LC)
				.setProductionFactions(Faction.FS, Faction.LC).setTechRating(TechRating.C)
				.setAvailability(AvailabilityValue.X, AvailabilityValue.X, AvailabilityValue.C, AvailabilityValue.B);

	}
}
