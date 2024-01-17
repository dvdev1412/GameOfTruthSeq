package com.example.gameoftruthseq.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String starName;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    private Image image;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "star")
    List<Question> questions;

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Long id) {
        questions = questions.stream().filter(q -> !q.getId().equals(id)).collect(Collectors.toList());
    }

}

