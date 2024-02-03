package com.zhy.subject.domain.job;


import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.zhy.subject.domain.service.SubjectLikedDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 同步点赞数据
 *
 * @author: 随缘而愈
 * @date: 2024/1/8
 */
@Component
@Slf4j
public class SyncLikedJob {

    @Resource
    private SubjectLikedDomainService subjectLikedDomainService;

    /**
     * 同步点赞数据任务
     */
    @XxlJob("syncLikedJobHandler")
    public void syncLikedJobHandler() throws Exception {
        XxlJobHelper.log("syncLikedJobHandler.start");
        try {
            subjectLikedDomainService.syncLiked();
        } catch (Exception e) {
            XxlJobHelper.log("syncLikedJobHandler.error" + e.getMessage());
        }
    }

}
