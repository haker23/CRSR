package com.example.crsr.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2022-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AssessmentQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    private String questionId;

    private String questionContent;

    private Integer questionCategory;

    private Integer minCount;

    private Integer maxCount;


}
