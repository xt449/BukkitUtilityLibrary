/*
 * Copyright (c) 2020 xt449/BinaryBanana
 *
 * This file is part of BukkitUtilityLibrary.
 *
 * BukkitUtilityLibrary is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BukkitUtilityLibrary is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BukkitUtilityLibrary.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.github.xt449.bukkitutilitylibrary.world;

import org.bukkit.World;

/**
 * @author xt449
 */
public class ManagedWorld extends AbstractWorld {

	ManagedWorld(String name, World world) {
		super(name, world);
	}
}
