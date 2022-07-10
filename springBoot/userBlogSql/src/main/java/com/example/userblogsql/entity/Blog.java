package com.example.userblogsql.entity;


import com.example.userblogsql.dto.BlogInfo;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "blog")
@SqlResultSetMapping(
        name = "userInfo",
        classes = @ConstructorResult(
                targetClass = BlogInfo.class,
                columns = {
                        @ColumnResult(name = "id", type = String.class),
                        @ColumnResult(name = "title", type = String.class),
                        @ColumnResult(name = "slug", type = String.class),
                        @ColumnResult(name = "description", type = String.class),
                        @ColumnResult(name = "content", type = String.class),
                        @ColumnResult(name = "thumbnail", type = String.class),
                        @ColumnResult(name = "published_at", type = String.class),
                        @ColumnResult(name = "count_comment", type = Integer.class),
                        @ColumnResult(name = "author", type = String.class)
                }
        )
)
@NamedNativeQuery(
        name = "getAllBlogInfo",
        resultSetMapping = "userInfo",
        query = "select  b.id, b.title, b.slug ,b.description,b.thumbnail,\n" +
                "date_format (b.published_at, '%d/%m/%y') as published_at,\n" +
                "json_object(\"id\" , u.id,\"name\",u.name) as author,\n" +
                "count(c.id) as count_comment\n" +
                "from blog b\n" +
                "left join `user` u on b.user_id = u.id\n" +
                "left join comment c on b.id = c.blog_id\n" +
                "where b.status = 1\n" +
                "group by b.id\n" +
                "order by published_at DESC"
)

@NamedNativeQuery(
        name = "getAllBlogAndComment",
        resultSetMapping = "userInfo",
        query = "@NamedNativeQuery(\n" +
                "        name = \"getAllBlogInfo\",\n" +
                "        resultSetMapping = \"userInfo\",\n" +
                "        query = \"select  b.id, b.title, b.slug ,b.description,b.content,b.thumbnail,\\n\" +\n" +
                "                \"date_format (b.published_at, '%d/%m/%y') as published_at,\\n\" +\n" +
                "                \"json_object(\\\"id\\\" , u.id,\\\"name\\\",u.name) as author,\\n\" +\n" +
                "                \"count(c.id) as count_comment\\n\" +\n" +
                "                \"from blog b\\n\" +\n" +
                "                \"left join `user` u on b.user_id = u.id\\n\" +\n" +
                "                \"left join comment c on b.id = c.blog_id\\n\" +\n" +
                "                \"where b.status = 1\\n\" +\n" +
                "                \"group by b.id\\n\" +\n" +
                "                \"order by published_at DESC\"\n" +
                ")"
)


public class Blog {
    @Id
    @GeneratedValue(generator = "custom_generate")
    @GenericGenerator(name = "custom_generate", strategy = "com.example.userblogsql.generator.CustomerIdGenerator")
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedAt;

    @Column(name = "published_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime publishedAt;

    @Column(name = "status", columnDefinition = "int default 0")
    private int status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "blog_categories",
            joinColumns = @JoinColumn(name = "blog_id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id"))
    private List<Category> categories = new ArrayList<>();

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now().minusMonths(2);
        updatedAt = createdAt;
        if (status == 1) {
            publishedAt = updatedAt;
        }
    }


}