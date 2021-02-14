package cn.hncj.assistant.mapper;

import cn.hncj.assistant.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings({"unused", "UnusedReturnValue"})
@Mapper
@Repository
public interface StudentMapper {
    /* 验证学生账号和密码 */
    int verifyStudent(String student_id, String student_password);

    /* 学生数量 */
    Integer countStudent();

    /* 查询所有学生 */
    List<Student> selectStudents(Integer start, Integer size);

    /* 修改学生 */
    Integer updateStudent(
            @Param("student_id") String student_id,
            @Param("student_password") String student_password,
            @Param("student_avatar") String student_avatar,
            @Param("student_phone") String student_phone,
            @Param("student_email") String student_email,
            @Param("student_status") Integer student_status
    );

    /* 删除学生 */
    Integer deleteStudentById(@Param("student_id") String student_id);


}
