package cn.hncj.assistant;

import cn.hncj.assistant.mapper.TeacherMapper;
import cn.hncj.assistant.mapper.UserMapper;
import cn.hncj.assistant.pojo.User;
import cn.hncj.assistant.service.AdministratorService;
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
    AdministratorService administratorService;

    @Test
    void testMybatis() {
        List<User> users = userMapper.getUsers();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    void testMapper() {
//        List<Teacher> teachers = teacherMapper.getTeachers();
//
//        for (Teacher teacher : teachers) {
//            System.out.println(teacher);
//        }

//        System.out.println(administratorService.findAdministratorByLogin("root", "E10ADC3949BA59ABBE56E057F20F883E"));

//        teacherMapper.insertTeacher("777777777", "root", "张三", 1, "11111111111", "");

    }

}
