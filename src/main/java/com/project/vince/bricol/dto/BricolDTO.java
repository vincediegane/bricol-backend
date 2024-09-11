package com.project.vince.bricol.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BricolDTO {
    private Long id;
    private String name;
    private String description;
    private String image;
    private String owner;
    private String handyman; // bricoleur
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
