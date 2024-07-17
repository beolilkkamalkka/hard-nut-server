package org.thirteen.hardnut.domain.stuff.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.thirteen.hardnut.domain.stuff.domain.type.StuffStatus;
import org.thirteen.hardnut.shared.entity.BaseTimeEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "stuff")
public class Stuff extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long usedYear;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private StuffStatus status;

    @Builder
    public Stuff(String name, Long usedYear) {
        this.name = name;
        this.usedYear = usedYear;
    }

    public void abandon() {
        this.status = StuffStatus.ABANDONED;
    }

    public void use() {
        this.status = StuffStatus.USING;
    }
}
