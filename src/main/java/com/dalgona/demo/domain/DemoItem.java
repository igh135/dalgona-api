package com.dalgona.demo.domain;

import com.dalgona.demo.domain.entity.DemoEntity;
import lombok.*;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.util.Assert;

import javax.management.MBeanServerFactory;
import java.net.http.HttpRequest;
import java.time.LocalDateTime;
import java.util.Calendar;


import static com.dalgona.demo.domain.entity.DemoEntity.*;



@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
public class DemoItem {
    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public DemoEntity toEntity(){
        DemoEntity build = new DemoEntity(
                id,
                writer,
                title,
                content
                );
        return build;
    }

    @Builder
    public DemoItem(Long id, String title, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}






