package cn.hncj.assistant;

import cn.hncj.assistant.entity.User;
import cn.hncj.assistant.entity.WeekMission;
import cn.hncj.assistant.mapper.*;
import cn.hncj.assistant.service.CourseService;
import cn.hncj.assistant.service.TeacherService;
import cn.hncj.assistant.service.WeekPeriodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MainApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseService courseService;

    @Autowired
    ClassMapper classMapper;

    @Autowired
    WeekPeriodService weekPeriodService;

    @Autowired
    WeekMissionMapper weekMissionMapper;

    @Test
    void testMybatis() {
//        List<User> users = userMapper.getUsers();
//
//        for (User user : users) {
//            System.out.println(user);
//        }
    }

    @Test
    void testMapper() {
//        List<WeekMission> weekMissions = weekMissionMapper.selectByCourseId(1);
//        for (WeekMission weekMission : weekMissions) {
//            System.out.println(weekMission);
//        }
    }

    @Test
    void testService() {
//        weekPeriodService.selectWeekPeriod(1);
    }

}
