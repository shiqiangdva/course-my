package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author V丶x
 * @Date: 2020-05-06 15:52
 * @Email: 1114005726@qq.com
 **/
@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<Chapter> list() {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("00000001");
        chapterExample.setOrderByClause("id desc");//asc
        return chapterMapper.selectByExample(chapterExample);
    }

}
