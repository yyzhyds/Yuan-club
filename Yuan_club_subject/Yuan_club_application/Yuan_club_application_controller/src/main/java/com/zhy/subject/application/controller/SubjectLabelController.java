package com.zhy.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zhy.subject.application.convert.SubjectCategoryDTOConverter;
import com.zhy.subject.application.convert.SubjectLabelDTOConverter;
import com.zhy.subject.application.dto.SubjectCategoryDTO;
import com.zhy.subject.application.dto.SubjectLabelDTO;
import com.zhy.subject.common.enetity.Result;
import com.zhy.subject.domain.entity.SubjectCategoryBO;
import com.zhy.subject.domain.entity.SubjectLabelBO;
import com.zhy.subject.domain.service.SubjectLabelDomainService;
import com.zhy.subject.infra.basic.entity.SubjectLabel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 16/1/2024 上午10:10
 */

@RestController
@RequestMapping("/subject/label")
@Slf4j
public class SubjectLabelController {

    @Resource
    private SubjectLabelDomainService subjectLabelDomainService;

    /**
     * 新增标签
     */
    @PostMapping("/add")
    public Result<List<SubjectLabelDTO>> add(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectLabelController.add.dto:{}", JSON.toJSONString(subjectLabelDTO));
            }
            Preconditions.checkNotNull(subjectLabelDTO.getCategoryId(),
                    "分类id不能为空");
            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE.convertDtoToLabel(subjectLabelDTO);
            subjectLabelDomainService.add(subjectLabelBO);
            return Result.ok(true);
        } catch (Exception e) {
            log.error("SubjectLabelController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增标签失败");
        }
    }


    /**
     * 更新标签
     */
    @PostMapping("/update")
    public Result<Boolean> update(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectLabelController.update.dto:{}", JSON.toJSONString(subjectLabelDTO));
            }

            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE.
                    convertDtoToLabelBo(subjectLabelDTO);

            Boolean result = subjectLabelDomainService.update(subjectLabelBO);
            return Result.ok(result);
        } catch (Exception e) {
            log.error("SubjectLabelController.update.error:{}", e.getMessage(), e);
            return Result.fail("更新标签失败");
        }

    }

    /**
     * 删除标签
     */
    @PostMapping("/delete")
    public Result<Boolean> delete(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectLabelController.delete.dto:{}", JSON.toJSONString(subjectLabelDTO));
            }

            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE
                    .convertDtoToLabelBo(subjectLabelDTO);
            Boolean result = subjectLabelDomainService.delete(subjectLabelBO);
            return Result.ok(result);
        } catch (Exception e) {
            log.error("SubjectLabelController.delete.error:{}", e.getMessage(), e);
            return Result.fail("删除标签失败");
        }

    }


    /**
     * 查询分类下标签
     */
    @PostMapping("/queryLabelByCategoryId")
    public Result<List<Boolean>> queryLabelByCategoryId(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("queryLabelByCategoryId.subjectLabelDTO.dto:{}",
                        JSON.toJSONString(subjectLabelDTO));
            }
            Preconditions.checkNotNull(subjectLabelDTO.getCategoryId(), "分类id不能为空");
            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE
                    .convertDtoToLabelBo(subjectLabelDTO);


            List<SubjectLabelBO> subjectLabelBOList = subjectLabelDomainService.queryLabel(subjectLabelBO);
            List<SubjectLabelDTO> subjectLabelDTOList = SubjectLabelDTOConverter.INSTANCE
                    .convertBoToLabelDTOList(subjectLabelBOList);
            return Result.ok(subjectLabelDTOList);
        } catch (Exception e) {
            log.error("SubjectLabelController.queryLabelByCategoryId.error:{}", e.getMessage(), e);
            return Result.fail("查询失败");
        }
    }
}
