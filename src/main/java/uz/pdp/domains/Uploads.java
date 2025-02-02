package uz.pdp.domains;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Uploads {
    private Integer id;
    private String originalName;
    private String generatedName;
    private String mimeType;
    private long size;
}
