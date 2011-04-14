package com.haulmont.cuba.core.sys.jpql.transform;

import com.haulmont.cuba.core.sys.jpql.tree.IdentificationVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.PathNode;
import org.antlr.runtime.tree.Tree;

/**
 * Author: Alexander Chevelev
 * Date: 06.04.2011
 * Time: 16:43:37
 */
public interface EntityReference {
    String replaceEntries(String queryPart, String replaceablePart);

    void renameVariableIn(PathNode node);

    Tree createNode();

    boolean isJoinableTo(IdentificationVariableNode node);
}
