package com.ext.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Comment {
    private String text;
    private boolean error;

    public Comment(String text, boolean error) {
        this.text = text;
        this.error = error;
    }
}
