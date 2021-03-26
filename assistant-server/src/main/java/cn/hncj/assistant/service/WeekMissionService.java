package cn.hncj.assistant.service;

import cn.hncj.assistant.dto.WeekMissionDTO;
import cn.hncj.assistant.entity.WeekMission;

import java.util.List;

public interface WeekMissionService {

    /**
     * 根据周id查询周任务
     *
     * @param id id
     * @return WeekMission
     */
    List<WeekMissionDTO> selectByWeekId(Integer id);


    /**
     * 根据id查询周任务
     *
     * @param id id
     * @return WeekMission
     */
    WeekMissionDTO selectById(Integer id);


    /**
     * 添加周任务
     *
     * @param week_id week_id
     * @param name    name
     * @param type    type
     * @return int
     */
    Integer insert(Integer week_id, String name, Integer type);


    /**
     * 删除周任务
     * @param week_mission_id week_mission_id
     * @return int
     */
    Integer delete(Integer week_mission_id);

    //////

    /**
     * 根据课程id 查询所有周任务的id和名称
     *
     * @param id id
     * @return WeekMission
     */
    List<WeekMission> selectByCourseId(Integer id);





    /**
     * 修改周任务内容
     *
     * @param id      id
     * @param content content
     * @return int
     */
    Integer updateContent(Integer id, String content);
}
