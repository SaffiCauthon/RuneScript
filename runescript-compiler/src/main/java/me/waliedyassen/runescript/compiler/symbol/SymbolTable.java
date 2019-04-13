/*
 * Copyright (c) 2019 Walied K. Yassen, All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package me.waliedyassen.runescript.compiler.symbol;

import me.waliedyassen.runescript.compiler.symbol.impl.CommandInfo;
import me.waliedyassen.runescript.compiler.symbol.impl.ConstantInfo;
import me.waliedyassen.runescript.compiler.type.Type;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a compile-time symbol table, it contains various information about different symbol taypes such as
 * constants, commands, scripts, and global variables.
 *
 * @author Walied K. Yassen
 */
public final class SymbolTable {

    /**
     * The defined constants map.
     */
    private final Map<String, ConstantInfo> constants = new HashMap<>();

    /**
     * The defined symbols map.
     */
    private final Map<String, CommandInfo> commands = new HashMap<>();

    /**
     * Defines a new constant symbol in this table.
     *
     * @param name
     *         the name of the constant.
     * @param type
     *         the type of the constant.
     * @param value
     *         the value of the constant.
     */
    public void defineConstant(String name, Type type, Object value) {
        if (constants.containsKey(name)) {
            throw new IllegalArgumentException("The constant '" + name + "' is already defined.");
        }
        constants.put(name, new ConstantInfo(name, type, value));
    }

    /**
     * Looks-up for the {@link ConstantInfo constant information} with the specified {@code name}.
     *
     * @param name
     *         the name of the constant.
     *
     * @return the {@link ConstantInfo} if it was present otherwise {@code null}.
     */
    public ConstantInfo lookupConstant(String name) {
        return constants.get(name);
    }

    /**
     * @param name
     * @param type
     * @param arguments
     * @param alternative
     */
    public void defineCommand(String name, Type type, Type[] arguments, boolean alternative) {
        if (commands.containsKey(name)) {
            throw new IllegalArgumentException("The command '" + name + "' is already defined.");
        }
        commands.put(name, new CommandInfo(name, type, arguments, alternative));
    }

    /**
     * Looks-up for the {@link ConstantInfo command information} with the specified {@code name}.
     *
     * @param name
     *         the name of the command.
     *
     * @return the {@link CommandInfo} if it was present otherwise {@code null}.
     */
    public CommandInfo lookupCommand(String name) {
        return commands.get(name);
    }
}
