package cn.hncj.assistant.controller;

import cn.hncj.assistant.annotation.RoleCheck;
import cn.hncj.assistant.common.ServerResponse;
import cn.hncj.assistant.service.DiscussionCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings({"SpellCheckingInspection", "SpringJavaAutowiredFieldsWarningInspection"})
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/discussioncomment")
public class DiscussionCommentController {

    @Autowired
    DiscussionCommentService discussionCommentService;

    @GetMapping("/selectdissbyperiodid")
    @RoleCheck(RoleCheck.USER)
    public ServerResponse<Object> selectDiscussionByPeriodId(@RequestParam("id") Integer id) {
        return ServerResponse.createSuccess("查询成功", discussionCommentService.selectDiscussionByPeriodId(id));
    }

}