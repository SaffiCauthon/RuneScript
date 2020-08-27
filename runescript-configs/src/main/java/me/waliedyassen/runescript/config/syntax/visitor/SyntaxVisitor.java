/*
 * Copyright (c) 2020 Walied K. Yassen, All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package me.waliedyassen.runescript.config.syntax.visitor;

import me.waliedyassen.runescript.config.syntax.ConfigSyntax;
import me.waliedyassen.runescript.config.syntax.IdentifierSyntax;
import me.waliedyassen.runescript.config.syntax.PropertySyntax;
import me.waliedyassen.runescript.config.syntax.value.*;

/**
 * Represents the Abstract-Syntax-Tree node visitor.
 *
 * @param <R>
 *         the return type of the visit methods.
 */
public interface SyntaxVisitor<R> {

    /**
     * Gets called when we have just visited an {@link ConfigSyntax} object.
     *
     * @param config
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ConfigSyntax config);

    /**
     * Gets called when we have just visited an {@link PropertySyntax} object.
     *
     * @param property
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(PropertySyntax property);

    /**
     * Gets called when we have just visited an {@link ValueStringSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueStringSyntax value);

    /**
     * Gets called when we have just visited an {@link ValueIntegerSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueIntegerSyntax value);

    /**
     * Gets called when we have just visited an {@link ValueLongSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueLongSyntax value);

    /**
     * Gets called when we have just visited an {@link ValueBooleanSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueBooleanSyntax value);

    /**
     * Gets called when we have just visited an {@link ValueTypeSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueTypeSyntax value);

    /**
     * Gets called when we have just visited an {@link ValueConstantSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueConstantSyntax value);

    /**
     * Gets called when we have just visited an {@link ValueConfigSyntax} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(ValueConfigSyntax value);

    /**
     * Gets called when we have just visited an {@link IdentifierSyntax} object.
     *
     * @param identifier
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(IdentifierSyntax identifier);
}