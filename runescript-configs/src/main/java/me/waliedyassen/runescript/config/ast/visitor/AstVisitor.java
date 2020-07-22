/*
 * Copyright (c) 2019 Walied K. Yassen, All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package me.waliedyassen.runescript.config.ast.visitor;

import me.waliedyassen.runescript.config.ast.AstConfig;
import me.waliedyassen.runescript.config.ast.AstIdentifier;
import me.waliedyassen.runescript.config.ast.AstProperty;
import me.waliedyassen.runescript.config.ast.value.*;

/**
 * Represents the Abstract-Syntax-Tree node visitor.
 *
 * @param <R>
 *         the return type of the visit methods.
 */
public interface AstVisitor<R> {

    /**
     * Gets called when we have just visited an {@link AstConfig} object.
     *
     * @param config
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstConfig config);

    /**
     * Gets called when we have just visited an {@link AstProperty} object.
     *
     * @param property
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstProperty property);

    /**
     * Gets called when we have just visited an {@link AstValueString} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstValueString value);

    /**
     * Gets called when we have just visited an {@link AstValueInteger} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstValueInteger value);

    /**
     * Gets called when we have just visited an {@link AstValueLong} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstValueLong value);

    /**
     * Gets called when we have just visited an {@link AstValueBoolean} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstValueBoolean value);

    /**
     * Gets called when we have just visited an {@link AstValueType} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstValueType value);

    /**
     * Gets called when we have just visited an {@link AstValueConstant} object.
     *
     * @param value
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstValueConstant value);

    /**
     * Gets called when we have just visited an {@link AstIdentifier} object.
     *
     * @param identifier
     *         the object we have just visited.
     *
     * @return An object which is specified by the implementation.
     */
    R visit(AstIdentifier identifier);
}
