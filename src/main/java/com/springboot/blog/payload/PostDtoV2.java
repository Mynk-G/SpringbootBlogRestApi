package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Schema(
        description = "PostDto Model Information"
)
public class PostDtoV2 {

    private long id;

    @NotEmpty
    @Size(min = 2, message = "Post Title should have at least 2 characters")
    @Schema(
            description = "Blog Post Title"
    )
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post Description should have at least 2 characters")
    @Schema(
            description = "Blog Post Description"
    )
    private String description;

    @NotEmpty
    @Schema(
            description = "Blog Post Content"
    )
    private String content;

    @Schema(
            description = "Blog Post Comments"
    )
    private Set<CommentDto> comments;

    @Schema(
            description = "Blog Post CategoryId"
    )
    private Long categoryId;

    private List<String> tags;

}
