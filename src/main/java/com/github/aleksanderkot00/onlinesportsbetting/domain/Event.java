package com.github.aleksanderkot00.onlinesportsbetting.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity(name = "EVENTS")
public class Event {

    @NotNull
    @Id
    @GeneratedValue
    private long eventId;

    @NotNull
    private LocalDateTime dateTime;

    @NotNull
    @Size(min = 2, max = 35)
    private String teamOneName;

    @NotNull
    @Size(min = 2, max = 35)
    private String teamTwoName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    private Result result;
}
