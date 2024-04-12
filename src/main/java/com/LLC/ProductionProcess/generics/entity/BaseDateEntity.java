package com.LLC.ProductionProcess.generics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Setter
@Getter
@MappedSuperclass
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseDateEntity {

    @Column(name = "CREATED_DATE")
    private LocalDate createdDate;

    @Column(name = "CREATED_TIME")
    private LocalTime createdTime;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @NotNull
    @Column(name = "responsable")
    private String createdBy;

    @PrePersist
    public void onPrePersist() {
        this.setCreatedDate(LocalDate.now());
        this.setCreatedTime(LocalTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

    @PreUpdate
    public void onPreUpdate() {
        this.setUpdatedAt(LocalDateTime.now());
    }
}
