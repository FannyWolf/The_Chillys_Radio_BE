package theChillys.chillys_radio.station.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "station_uuid", nullable = false)
    private String stationuuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "url_resolved")
    private String urlResolved;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "favicon")
    private String favicon;

    @Column(name = "tags")
    private String tags;

    @Column(name = "country")
    private String country;

    @Column(name = "country_code")
    private String countrycode;

    @Column(name = "state")
    private String state;

    @Column(name = "language")
    private String language;

    @Column(name = "language_codes")
    private String languagecodes;

    @Column(name = "votes")
    private Long votes;

    @Column(name = "last_change_time")
    private String lastchangetime;

    @Column(name = "codec")
    private String codec;

    @Column(name = "bitrate")
    private Integer bitrate;

    @Column(name = "last_check_ok")
    private Integer lastcheckok;

    @Column(name = "click_count")
    private Long clickcount;
}
