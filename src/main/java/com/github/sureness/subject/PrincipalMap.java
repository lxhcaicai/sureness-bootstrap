package com.github.sureness.subject;

import java.util.Map;

/**
 * 将Map映射到存储
 */
public interface PrincipalMap extends Map<String,Object> {

    /**
     * set principal map principal map
     * @param principals
     * @return PrincipalMap instance
     */
    PrincipalMap setPrincipals(Map<String,Object> principals);

    /**
     * set Principal
     * @param key key
     * @param principal
     * @return
     */
    Object setPrincipal(String key, Object principal);

    /**
     * get principal by key
     * @param key key
     * @return principal
     */
    Object getPrincipal(String key);

    /**
     * remove principal by key
     * @param key key
     * @return principal
     */
    Object removePrincipal(String key);
}
