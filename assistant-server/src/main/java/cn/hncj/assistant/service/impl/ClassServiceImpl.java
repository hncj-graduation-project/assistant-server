package cn.hncj.assistant.service.impl;

import cn.hncj.assistant.entity.Class;
import cn.hncj.assistant.mapper.ClassMapper;
import cn.hncj.assistant.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassMapper classMapper;

    /**
     * 根据课程id查询班级
     *
     * @param course_id course_id
     * @return class
     */
    @Override
    public List<Class> selectByCourseId(String course_id) {
        return classMapper.selectByCourseId(course_id);
    }


    /**
     * 添加班级
     *
     * @param course_id course_id
     * @param name      name
     * @return int
     */
    @Override
    public Integer insertClass(Integer course_id, String name) {
        Class entity = new Class();
        entity.setCourse_id(course_id).setClass_name(name);
        return classMapper.insert(entity);
    }


    /**
     * 删除班级
     *
     * @param class_id class_id
     * @return int
     */
    @Override
    public Integer deleteClass(Integer class_id) {
        return classMapper.deleteById(class_id);
    }
}