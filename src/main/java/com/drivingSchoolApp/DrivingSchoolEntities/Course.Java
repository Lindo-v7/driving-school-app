import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
  
    private String courseName;
    private String description;
    private int duration; // Duration in hours
    private BigDecimal fee; // Use BigDecimal for monetary values
    private String prerequisites;
  
    // Getters and Setters omitted for brevity
  
    // Add constructors and other methods as needed
  }
  