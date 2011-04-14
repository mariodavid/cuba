/*
 * Copyright (c) 2011 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */

package com.haulmont.cuba.gui.autocomplete.impl;

import com.haulmont.cuba.core.sys.jpql.InferredType;

import java.util.Set;

/**
 * Author: Alexander Chevelev
 * Date: 24.03.2011
 * Time: 21:42:45
 */
public class HintRequest {
    private int position;
    private String query;
    private Set<InferredType> expectedTypes;

    public HintRequest() {
    }

    public int getPosition() {
        return position;
    }

    public String getQuery() {
        return query;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Set<InferredType> getExpectedTypes() {
        return expectedTypes;
    }

    public void setExpectedTypes(Set<InferredType> expectedTypes) {
        this.expectedTypes = expectedTypes;
    }
}