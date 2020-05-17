package com.monda.sledu.ajantha.model.dto;

import com.monda.sledu.ajantha.model.dto.SubTopicDTO;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TopicDTO {

    private Integer lessonId;
    private Integer topicId;
    private String topicName;
    private List<SubTopicDTO> subTopicList;
}
