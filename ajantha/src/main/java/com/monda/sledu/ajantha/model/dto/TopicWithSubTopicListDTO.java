package com.monda.sledu.ajantha.model.dto;

import com.monda.sledu.ajantha.model.dto.SubTopicDTO;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.monda.sledu.ajantha.model.SmartNote;

@Setter
@Getter
@NoArgsConstructor
public class TopicWithSubTopicListDTO {

    private Integer lessonId;
    private Integer topicId;
    private String topicName;
    private List<SubTopicDTO> subTopicList;
}
