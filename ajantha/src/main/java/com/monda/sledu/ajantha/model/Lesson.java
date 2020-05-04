package com.monda.sledu.ajantha.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Id;
import com.monda.sledu.ajantha.model.Question;
import java.util.List;
import javax.persistence.OneToMany;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.CascadeType;

@Table(name = "t_lesson", schema = "sledu")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Lesson {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="subject_id")
    private int subjectId;

    @Column(name="name")
    private String name;

    @Column(name="image_url")
    private String imageUrl;
}
