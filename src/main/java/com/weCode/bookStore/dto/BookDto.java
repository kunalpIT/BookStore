package com.weCode.bookStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String title;

    private BookDto(Builder builder) {
        this.title = builder.title;

    }

    public static class Builder {
        private String title;
     

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public BookDto build() {
            return new BookDto(this);
        }
    }

    // Getters for the fields
    public String getTitle() {
        return title;
    }

}

	


