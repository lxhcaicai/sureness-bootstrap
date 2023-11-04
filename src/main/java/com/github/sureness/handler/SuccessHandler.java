package com.github.sureness.handler;

import com.github.sureness.subject.SubjectSum;

/**
 * 鉴权成功后的处理程序
 */
public interface SuccessHandler {

    /**
     * 成功后处理流程
     * @param subjectSum
     * @param request
     */
    void processHandler(SubjectSum subjectSum, Object request);
}
