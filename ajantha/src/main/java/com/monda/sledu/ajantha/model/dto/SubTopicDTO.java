package com.monda.sledu.ajantha.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SubTopicDTO {
    private Integer subTopicId;
    private Integer topicId;
    private String subTopicName;
}
