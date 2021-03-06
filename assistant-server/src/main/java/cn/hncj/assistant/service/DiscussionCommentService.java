package cn.hncj.assistant.service;

import cn.hncj.assistant.entity.Discussion;

import java.util.List;

public interface DiscussionCommentService {

    /**
     * 根据学时id查询课堂讨论
     *
     * @param period_id period_id
     * @return Discussion
     */
    List<Discussion> selectDiscussionByPeriodId(Integer period_id);

}