package theChillys.chillys_radio.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import theChillys.chillys_radio.station.dto.StationResponseDto;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private Set<Role> roles;

    public UserResponseDto(Long id, String name, String email, List<StationResponseDto> favoriteStationsDto) {
    }
}
