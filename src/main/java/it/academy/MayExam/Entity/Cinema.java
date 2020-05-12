package it.academy.MayExam.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "exam_may_cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "capacity")
    Integer capacity;

    @Column(name = "address")
    String address;

    @Column(name = "web_site")
    String webSite;
}
