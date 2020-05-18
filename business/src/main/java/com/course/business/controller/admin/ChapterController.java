package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author V丶x
 * @Date: 2020-05-06 13:44
 * @Email: 1114005726@qq.com
 **/
@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public PageDto chapter(@RequestBody PageDto pageDto) {
        LOG.info("pageDto: {}", pageDto);

        chapterService.list(pageDto);
        return pageDto;
    }

    @RequestMapping("/save")
    public ChapterDto chapter(@RequestBody ChapterDto chapterDto) {
        LOG.info("chapterDto: {}", chapterDto);

        chapterService.save(chapterDto);
        return chapterDto;
    }

}
