package it.academy.MayExam.Entity;

import it.academy.MayExam.Singleton.Cinema;
import it.academy.MayExam.Singleton.FactoryItem;
import it.academy.MayExam.Singleton.Restaurant;
import it.academy.MayExam.Singleton.Ticket;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "exam_may_factory")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "log")
    @CreatedDate
    Date askingTime=new Date();

    public FactoryItem getFactoryItem(String codeType){
        if (codeType.equals("R")){
            return Restaurant.getInstance();
        }else if (codeType.equals("C")){
            return Cinema.getInstance();
        }else if (codeType.equals("T")){
            return Ticket.getInstance();
        }
        throw new RuntimeException("No such code");
    }

}
