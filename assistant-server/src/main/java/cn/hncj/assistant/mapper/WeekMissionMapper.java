package cn.hncj.assistant.mapper;

import cn.hncj.assistant.entity.WeekMission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WeekMissionMapper extends BaseMapper<WeekMission> {

    /**
     * 根据课程id 查询所有周任务的id和名称
     *
     * @param course_id course_id
     * @return WeekMission
     */
    List<WeekMission> selectByCourseId(@Param("course_id") Integer course_id);
}