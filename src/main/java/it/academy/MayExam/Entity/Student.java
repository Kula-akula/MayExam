package it.academy.MayExam.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "exam_may_students")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "course")
    String course;

    @Column(name = "date_of_registration")
    String dateOfRegistration;

    @Column(name = "fee_amount")
    Integer feeAmount;

}
