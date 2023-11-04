package com.github.sureness.subject;

import java.io.Serializable;
import java.util.Collection;

/**
 * 类型总结，包含一些基本的信息内容
 */
public interface SubjectSum extends Serializable {

    /**
     * 获取身份验证对象的帐户
     * @return
     */
    Object getPrincipal();

    /**
     * 映射 主体的键值
     * eg: id-idValue, customName-value, issuer-value
     * @return
     */
    PrincipalMap getPrincipalMap();

    /**
     * 判断是否存在角色“var1”
     * @param val1
     * @return
     */
    boolean hasRole(String val1);

    /**
     * 判断是否具有所有角色—var1
     * @param var1
     * @return
     */
    boolean hasAllRoles(Collection<String> var1);

    /**
     * 获取它所拥有的角色
     * @return
     */
    Object getRoles();

    /**
     * 获取它想要访问的目标资源uri
     * @return
     */
    Object getTargetResource();

}
