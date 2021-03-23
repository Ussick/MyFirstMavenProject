package org.example.lombock;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(staticName = "getInstance")
@RequiredArgsConstructor
@Builder
public class UserModel {
    private String fullName;
    private int age;
    @NonNull
    private String email;
    @NonNull
    private int id;
    @Singular
    private List<String> addresses;

//    public static UserModel getInstance(){
//        return new UserModel();
//    }

}
