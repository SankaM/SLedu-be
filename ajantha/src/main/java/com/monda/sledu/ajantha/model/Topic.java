package com.monda.sledu.ajantha.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Id;

@Table(name = "t_topic", schema = "sledu")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Topic {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="topic_id")
    private Integer topicId;

    @Column(name="sub_topic_id")
    private Integer subTopicId;

    @Column(name="lesson_id")
    private Integer lessonId;

    @Column(name="topic_name")
    private String topicName;

    @Column(name="sub_topic_name")
    private String subTopicName;
}
