package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     int id;
     String name;
     long mobile;
     String email;
     String gender;
     Date dob;
     String address;
     String[] skills;
     String country;
}
