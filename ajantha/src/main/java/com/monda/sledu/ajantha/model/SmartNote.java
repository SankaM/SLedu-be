package com.monda.sledu.ajantha.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Id;

@Table(name = "t_smart_note", schema = "sledu")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class SmartNote {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="topic_id")
    private Integer topicId;

    @Column(name="sub_topic_id")
    private Integer subTopicId;

    @Column(name="sub_topic_name")
    private String subTopicName;

    @Column(name="image_def_url")
    private String imageDefUrl;

    @Column(name="defenition")
    private String definition;

    @Column(name="theory")
    private String theory;

    @Column(name="image_theory_url")
    private String imageTheoryUrl;

    @Column(name="example")
    private String example;

    @Column(name="image_example_url")
    private String imageExampleUrl;
}
