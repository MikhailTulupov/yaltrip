package ru.yaltrip.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ru.yaltrip.model.User;

/**
 * This class presents {@link User} data transfer object (DTO)
 * for transfer data between application layers.
 * This DTO class needs for transfer data to server when user registration account.
 */
@Data
@Schema
public class SignUpRequestDTO {
    @Schema(name = "name",
            title = "Account username",
            type = "String",
            example = "user-1")
    private String name;

    @Schema(name = "phoneNumber",
            title = "phone number",
            type = "String",
            example = "+79999999999")
    private String phoneNumber;

    @Schema(name = "password",
            title = "account password",
            example = "qwerty123456")
    private String password;
}
