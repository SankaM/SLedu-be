package com.monda.sledu.ajantha.model.dto;

import com.monda.sledu.ajantha.model.dto.TopicWithSubTopicListDTO;
import java.util.List;
import com.monda.sledu.ajantha.model.SmartNote;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TopicListWithDefaultSmartNoteDTO {

    private List<TopicWithSubTopicListDTO> topics;
    private SmartNote defaultSmartNote;

}
