package cn.hncj.assistant.mapper;

import cn.hncj.assistant.entity.Discussion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussionMapper extends BaseMapper<Discussion> {

    /**
     * 根据学时id查询课堂讨论
     *
     * @param period_id period_id
     * @return Discussion
     */
    List<Discussion> selectByPeriodId(@Param("period_id") Integer period_id);

}